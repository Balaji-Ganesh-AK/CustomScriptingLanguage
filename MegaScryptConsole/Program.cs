using System;
using System.Collections.Generic;
using MegaScrypt;

namespace MegaScryptConsole
{
    class Program
    {

        static void Main(string[] args)
        {
            Machine machine = new Machine();
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