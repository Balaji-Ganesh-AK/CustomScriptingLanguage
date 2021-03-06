//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from MegaScrypt.g4 by ANTLR 4.8

// Unreachable code detected
#pragma warning disable 0162
// The variable '...' is assigned but its value is never used
#pragma warning disable 0219
// Missing XML comment for publicly visible type or member '...'
#pragma warning disable 1591
// Ambiguous reference in cref attribute
#pragma warning disable 419

using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using IToken = Antlr4.Runtime.IToken;

/// <summary>
/// This interface defines a complete generic visitor for a parse tree produced
/// by <see cref="MegaScryptParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface IMegaScryptVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] MegaScryptParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] MegaScryptParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.compoundId"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitCompoundId([NotNull] MegaScryptParser.CompoundIdContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] MegaScryptParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] MegaScryptParser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.increment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIncrement([NotNull] MegaScryptParser.IncrementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.bincrement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBincrement([NotNull] MegaScryptParser.BincrementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] MegaScryptParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.ifStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStmt([NotNull] MegaScryptParser.IfStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.elseifStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElseifStmt([NotNull] MegaScryptParser.ElseifStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.elseStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElseStmt([NotNull] MegaScryptParser.ElseStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] MegaScryptParser.ExpressionContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.funcDeclearation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitFuncDeclearation([NotNull] MegaScryptParser.FuncDeclearationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.varList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitVarList([NotNull] MegaScryptParser.VarListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.returnStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitReturnStmt([NotNull] MegaScryptParser.ReturnStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.invocation"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitInvocation([NotNull] MegaScryptParser.InvocationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.paramList"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitParamList([NotNull] MegaScryptParser.ParamListContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.object"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObject([NotNull] MegaScryptParser.ObjectContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.objectPair"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObjectPair([NotNull] MegaScryptParser.ObjectPairContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.objectGet"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObjectGet([NotNull] MegaScryptParser.ObjectGetContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.objectValidEntry"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitObjectValidEntry([NotNull] MegaScryptParser.ObjectValidEntryContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.array"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArray([NotNull] MegaScryptParser.ArrayContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.arrayIndex"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitArrayIndex([NotNull] MegaScryptParser.ArrayIndexContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.forLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForLoop([NotNull] MegaScryptParser.ForLoopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.whileLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitWhileLoop([NotNull] MegaScryptParser.WhileLoopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.forEachLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitForEachLoop([NotNull] MegaScryptParser.ForEachLoopContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="MegaScryptParser.doWhileLoop"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDoWhileLoop([NotNull] MegaScryptParser.DoWhileLoopContext context);
}
