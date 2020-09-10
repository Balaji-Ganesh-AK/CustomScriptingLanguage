//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     ANTLR Version: 4.8
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

// Generated from DNEScrypt.g4 by ANTLR 4.8

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
/// by <see cref="DNEScryptParser"/>.
/// </summary>
/// <typeparam name="Result">The return type of the visit operation.</typeparam>
[System.CodeDom.Compiler.GeneratedCode("ANTLR", "4.8")]
[System.CLSCompliant(false)]
public interface IDNEScryptVisitor<Result> : IParseTreeVisitor<Result> {
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.program"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitProgram([NotNull] DNEScryptParser.ProgramContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.statement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitStatement([NotNull] DNEScryptParser.StatementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.declaration"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitDeclaration([NotNull] DNEScryptParser.DeclarationContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.assignment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitAssignment([NotNull] DNEScryptParser.AssignmentContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.increment"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIncrement([NotNull] DNEScryptParser.IncrementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.bincrement"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBincrement([NotNull] DNEScryptParser.BincrementContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.block"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitBlock([NotNull] DNEScryptParser.BlockContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.ifStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitIfStmt([NotNull] DNEScryptParser.IfStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.elseifStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElseifStmt([NotNull] DNEScryptParser.ElseifStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.elseStmt"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitElseStmt([NotNull] DNEScryptParser.ElseStmtContext context);
	/// <summary>
	/// Visit a parse tree produced by <see cref="DNEScryptParser.expression"/>.
	/// </summary>
	/// <param name="context">The parse tree.</param>
	/// <return>The visitor result.</return>
	Result VisitExpression([NotNull] DNEScryptParser.ExpressionContext context);
}
