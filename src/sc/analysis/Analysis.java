/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.analysis;

import sc.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgramme(AProgramme node);
    void caseAOrExpr(AOrExpr node);
    void caseAAndExpr(AAndExpr node);
    void caseAAndLogAnd(AAndLogAnd node);
    void caseALessLogAnd(ALessLogAnd node);
    void caseALessComparison(ALessComparison node);
    void caseAEqualityComparison(AEqualityComparison node);
    void caseAAdsousComparison(AAdsousComparison node);
    void caseAAdditionAdsous(AAdditionAdsous node);
    void caseASousAdsous(ASousAdsous node);
    void caseAMultdivAdsous(AMultdivAdsous node);
    void caseAMultMultdiv(AMultMultdiv node);
    void caseADivMultdiv(ADivMultdiv node);
    void caseANegMultdiv(ANegMultdiv node);
    void caseANegNeg(ANegNeg node);
    void caseAParNeg(AParNeg node);
    void caseAParenthesisPar(AParenthesisPar node);
    void caseANombrePar(ANombrePar node);
    void caseAIdentifPar(AIdentifPar node);
    void caseAArrPar(AArrPar node);
    void caseAFcallPar(AFcallPar node);
    void caseAListExprListExpr(AListExprListExpr node);
    void caseAExprListExpr(AExprListExpr node);
    void caseAEmptyListExpr(AEmptyListExpr node);
    void caseAFunctionCall(AFunctionCall node);
    void caseAListInstr(AListInstr node);
    void caseAInstrListInstr(AInstrListInstr node);
    void caseAIdentifTab(AIdentifTab node);
    void caseAAffectation(AAffectation node);
    void caseATabAffectation(ATabAffectation node);
    void caseAIfThenCondElse(AIfThenCondElse node);
    void caseAIfThenElseCondElse(AIfThenElseCondElse node);
    void caseAIfThenCond(AIfThenCond node);
    void caseABloc(ABloc node);
    void caseAEmptyBloc(AEmptyBloc node);
    void caseAReturn(AReturn node);
    void caseALoop(ALoop node);
    void caseAAffInstr(AAffInstr node);
    void caseAConditionInstr(AConditionInstr node);
    void caseARetInstr(ARetInstr node);
    void caseALoopInstr(ALoopInstr node);
    void caseAFcallInstr(AFcallInstr node);
    void caseALDecfonc(ALDecfonc node);
    void caseADecfoncLDecfonc(ADecfoncLDecfonc node);
    void caseALDecvarLDecfonc(ALDecvarLDecfonc node);
    void caseADecvarLDecfonc(ADecvarLDecfonc node);
    void caseAVarsParameterizedDecfonc(AVarsParameterizedDecfonc node);
    void caseANoVarsParameterizedDecfonc(ANoVarsParameterizedDecfonc node);
    void caseAVarsNoParamsDecfonc(AVarsNoParamsDecfonc node);
    void caseANoVarsNoParamsDecfonc(ANoVarsNoParamsDecfonc node);
    void caseALParams(ALParams node);
    void caseAIdentifLParams(AIdentifLParams node);
    void caseALDecvar(ALDecvar node);
    void caseADecvarLDecvar(ADecvarLDecvar node);
    void caseADecvar(ADecvar node);
    void caseADectabDecvar(ADectabDecvar node);
    void caseADectab(ADectab node);

    void caseTTest(TTest node);
    void caseTNombre(TNombre node);
    void caseTEspaces(TEspaces node);
    void caseTCommentaire(TCommentaire node);
    void caseTIf(TIf node);
    void caseTType(TType node);
    void caseTThen(TThen node);
    void caseTElse(TElse node);
    void caseTLAcc(TLAcc node);
    void caseTRAcc(TRAcc node);
    void caseTLSqr(TLSqr node);
    void caseTRSqr(TRSqr node);
    void caseTRet(TRet node);
    void caseTWhile(TWhile node);
    void caseTDo(TDo node);
    void caseTIdentif(TIdentif node);
    void caseTPlus(TPlus node);
    void caseTMinus(TMinus node);
    void caseTOr(TOr node);
    void caseTAnd(TAnd node);
    void caseTLess(TLess node);
    void caseTMult(TMult node);
    void caseTDiv(TDiv node);
    void caseTNot(TNot node);
    void caseTEquals(TEquals node);
    void caseTLPar(TLPar node);
    void caseTRPar(TRPar node);
    void caseTComma(TComma node);
    void caseTSemicol(TSemicol node);
    void caseEOF(EOF node);
    void caseInvalidToken(InvalidToken node);
}