using System;
using System.Collections.Generic;
using MegaScrypt;

namespace MegaScryptConsole
{
    class Program
    {



        static object Abs(List<object> parameters)
        {
            int i = (int) parameters[0];
            return Math.Abs(i);
        }

        static void Main(string[] args)
        {
            Machine machine = new Machine();
            machine.Declare(Abs, new string[] { "i" });
            string line;
            string script = "";
            while (true)
            {
                
                line = Console.ReadLine();

                if (line == "run")
                {
                    try
                    {
                        machine.Execute(script);
                        PrintVariables(machine);
                           // Print(machine);
                           script = "";
                    }
                    catch (Exception ex)
                    {
                        Console.WriteLine(ex.Message);
                    }

                }

                if (line=="exit")
                {
                    break;
                }

                if (line != null)
                {
                    if(line!="run")
                        script += line + "\n";
                   
                }

            }
        }


            static void PrintVariables(Machine machine)
            {
                List<string> varNames = machine.Target.variableNames;
                foreach (string varName in varNames)
                {
                    Console.WriteLine($"{varName}= {machine.Target.Get(varName)}");
                }
            }

        //    static void Print(Machine machine)
        //    {
        //        Dictionary<string, string> dictionary = machine.Target.variableToPrint;
        //        string varName;
        //        string stringToPrint;
        //        foreach (var dic in dictionary)
        //        {
        //            varName = dic.Key;
        //            stringToPrint = dic.Value;
        //            Console.WriteLine($"{stringToPrint}{machine.Target.Get(varName)}");
        //        }

        //}
    }
    }



//Machine machine = new Machine();
//string script = "";
//string line;
//while(true)
//{
//    line = Console.ReadLine();
//    if (line == null)
//    {
//        try
//        {
//            machine.Execute(script);
//        }
//        catch(Exception ex)
//        {
//            Console.WriteLine(ex.Message);
//        }
//        script = "";
//    }
//    else
//    {
//        script += line + "\n";
//    }
//}