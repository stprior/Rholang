package coop.rchain.syntax.rholang;
import coop.rchain.syntax.rholang.Absyn.*;
/** BNFC-Generated Composition Visitor
*/

public class ComposVisitor<A> implements
  coop.rchain.syntax.rholang.Absyn.Contr.Visitor<coop.rchain.syntax.rholang.Absyn.Contr,A>,
  coop.rchain.syntax.rholang.Absyn.Proc.Visitor<coop.rchain.syntax.rholang.Absyn.Proc,A>,
  coop.rchain.syntax.rholang.Absyn.Chan.Visitor<coop.rchain.syntax.rholang.Absyn.Chan,A>,
  coop.rchain.syntax.rholang.Absyn.Bind.Visitor<coop.rchain.syntax.rholang.Absyn.Bind,A>,
  coop.rchain.syntax.rholang.Absyn.PMBranch.Visitor<coop.rchain.syntax.rholang.Absyn.PMBranch,A>,
  coop.rchain.syntax.rholang.Absyn.CBranch.Visitor<coop.rchain.syntax.rholang.Absyn.CBranch,A>,
  coop.rchain.syntax.rholang.Absyn.Value.Visitor<coop.rchain.syntax.rholang.Absyn.Value,A>,
  coop.rchain.syntax.rholang.Absyn.Quantity.Visitor<coop.rchain.syntax.rholang.Absyn.Quantity,A>,
  coop.rchain.syntax.rholang.Absyn.Entity.Visitor<coop.rchain.syntax.rholang.Absyn.Entity,A>,
  coop.rchain.syntax.rholang.Absyn.Struct.Visitor<coop.rchain.syntax.rholang.Absyn.Struct,A>,
  coop.rchain.syntax.rholang.Absyn.Collect.Visitor<coop.rchain.syntax.rholang.Absyn.Collect,A>,
  coop.rchain.syntax.rholang.Absyn.VarPattern.Visitor<coop.rchain.syntax.rholang.Absyn.VarPattern,A>,
  coop.rchain.syntax.rholang.Absyn.PPattern.Visitor<coop.rchain.syntax.rholang.Absyn.PPattern,A>,
  coop.rchain.syntax.rholang.Absyn.CPattern.Visitor<coop.rchain.syntax.rholang.Absyn.CPattern,A>,
  coop.rchain.syntax.rholang.Absyn.PatternBind.Visitor<coop.rchain.syntax.rholang.Absyn.PatternBind,A>,
  coop.rchain.syntax.rholang.Absyn.PatternPatternMatch.Visitor<coop.rchain.syntax.rholang.Absyn.PatternPatternMatch,A>,
  coop.rchain.syntax.rholang.Absyn.ValPattern.Visitor<coop.rchain.syntax.rholang.Absyn.ValPattern,A>
{
/* Contr */
    public Contr visit(coop.rchain.syntax.rholang.Absyn.DContr p, A arg)
    {
      String name_ = p.name_;
      ListCPattern listcpattern_ = new ListCPattern();
      for (CPattern x : p.listcpattern_)
      {
        listcpattern_.add(x.accept(this,arg));
      }
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.DContr(name_, listcpattern_, proc_);
    }
/* Proc */
    public Proc visit(coop.rchain.syntax.rholang.Absyn.PNil p, A arg)
    {
      return new coop.rchain.syntax.rholang.Absyn.PNil();
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PValue p, A arg)
    {
      Value value_ = p.value_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PValue(value_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PVar p, A arg)
    {
      String var_ = p.var_;
      return new coop.rchain.syntax.rholang.Absyn.PVar(var_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PDrop p, A arg)
    {
      Chan chan_ = p.chan_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PDrop(chan_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PInject p, A arg)
    {
      Chan chan_ = p.chan_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PInject(chan_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PLift p, A arg)
    {
      Chan chan_ = p.chan_.accept(this, arg);
      ListProc listproc_ = new ListProc();
      for (Proc x : p.listproc_)
      {
        listproc_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PLift(chan_, listproc_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PInput p, A arg)
    {
      ListBind listbind_ = new ListBind();
      for (Bind x : p.listbind_)
      {
        listbind_.add(x.accept(this,arg));
      }
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PInput(listbind_, proc_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PChoice p, A arg)
    {
      ListCBranch listcbranch_ = new ListCBranch();
      for (CBranch x : p.listcbranch_)
      {
        listcbranch_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PChoice(listcbranch_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PMatch p, A arg)
    {
      Proc proc_ = p.proc_.accept(this, arg);
      ListPMBranch listpmbranch_ = new ListPMBranch();
      for (PMBranch x : p.listpmbranch_)
      {
        listpmbranch_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PMatch(proc_, listpmbranch_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PNew p, A arg)
    {
      ListVar listvar_ = p.listvar_;
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PNew(listvar_, proc_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PConstr p, A arg)
    {
      String name_ = p.name_;
      ListProc listproc_ = new ListProc();
      for (Proc x : p.listproc_)
      {
        listproc_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PConstr(name_, listproc_);
    }    public Proc visit(coop.rchain.syntax.rholang.Absyn.PPar p, A arg)
    {
      Proc proc_1 = p.proc_1.accept(this, arg);
      Proc proc_2 = p.proc_2.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPar(proc_1, proc_2);
    }
/* Chan */
    public Chan visit(coop.rchain.syntax.rholang.Absyn.CVar p, A arg)
    {
      String var_ = p.var_;
      return new coop.rchain.syntax.rholang.Absyn.CVar(var_);
    }    public Chan visit(coop.rchain.syntax.rholang.Absyn.CQuote p, A arg)
    {
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.CQuote(proc_);
    }
/* Bind */
    public Bind visit(coop.rchain.syntax.rholang.Absyn.InputBind p, A arg)
    {
      CPattern cpattern_ = p.cpattern_.accept(this, arg);
      Chan chan_ = p.chan_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.InputBind(cpattern_, chan_);
    }    public Bind visit(coop.rchain.syntax.rholang.Absyn.CondInputBind p, A arg)
    {
      CPattern cpattern_ = p.cpattern_.accept(this, arg);
      Chan chan_ = p.chan_.accept(this, arg);
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.CondInputBind(cpattern_, chan_, proc_);
    }
/* PMBranch */
    public PMBranch visit(coop.rchain.syntax.rholang.Absyn.PatternMatch p, A arg)
    {
      PPattern ppattern_ = p.ppattern_.accept(this, arg);
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PatternMatch(ppattern_, proc_);
    }
/* CBranch */
    public CBranch visit(coop.rchain.syntax.rholang.Absyn.Choice p, A arg)
    {
      ListBind listbind_ = new ListBind();
      for (Bind x : p.listbind_)
      {
        listbind_.add(x.accept(this,arg));
      }
      Proc proc_ = p.proc_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.Choice(listbind_, proc_);
    }
/* Value */
    public Value visit(coop.rchain.syntax.rholang.Absyn.VQuant p, A arg)
    {
      Quantity quantity_ = p.quantity_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.VQuant(quantity_);
    }    public Value visit(coop.rchain.syntax.rholang.Absyn.VEnt p, A arg)
    {
      Entity entity_ = p.entity_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.VEnt(entity_);
    }
/* Quantity */
    public Quantity visit(coop.rchain.syntax.rholang.Absyn.QInt p, A arg)
    {
      Integer integer_ = p.integer_;
      return new coop.rchain.syntax.rholang.Absyn.QInt(integer_);
    }    public Quantity visit(coop.rchain.syntax.rholang.Absyn.QDouble p, A arg)
    {
      Double double_ = p.double_;
      return new coop.rchain.syntax.rholang.Absyn.QDouble(double_);
    }
/* Entity */
    public Entity visit(coop.rchain.syntax.rholang.Absyn.EChar p, A arg)
    {
      Character char_ = p.char_;
      return new coop.rchain.syntax.rholang.Absyn.EChar(char_);
    }    public Entity visit(coop.rchain.syntax.rholang.Absyn.EStruct p, A arg)
    {
      Struct struct_ = p.struct_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.EStruct(struct_);
    }    public Entity visit(coop.rchain.syntax.rholang.Absyn.ECollect p, A arg)
    {
      Collect collect_ = p.collect_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.ECollect(collect_);
    }
/* Struct */
    public Struct visit(coop.rchain.syntax.rholang.Absyn.StructConstr p, A arg)
    {
      String var_ = p.var_;
      ListProc listproc_ = new ListProc();
      for (Proc x : p.listproc_)
      {
        listproc_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.StructConstr(var_, listproc_);
    }
/* Collect */
    public Collect visit(coop.rchain.syntax.rholang.Absyn.CString p, A arg)
    {
      String string_ = p.string_;
      return new coop.rchain.syntax.rholang.Absyn.CString(string_);
    }
/* VarPattern */
    public VarPattern visit(coop.rchain.syntax.rholang.Absyn.VarPtVar p, A arg)
    {
      String var_ = p.var_;
      return new coop.rchain.syntax.rholang.Absyn.VarPtVar(var_);
    }    public VarPattern visit(coop.rchain.syntax.rholang.Absyn.VarPtWild p, A arg)
    {
      return new coop.rchain.syntax.rholang.Absyn.VarPtWild();
    }
/* PPattern */
    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtVar p, A arg)
    {
      VarPattern varpattern_ = p.varpattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtVar(varpattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtNil p, A arg)
    {
      return new coop.rchain.syntax.rholang.Absyn.PPtNil();
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtVal p, A arg)
    {
      ValPattern valpattern_ = p.valpattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtVal(valpattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtDrop p, A arg)
    {
      CPattern cpattern_ = p.cpattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtDrop(cpattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtInject p, A arg)
    {
      CPattern cpattern_ = p.cpattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtInject(cpattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtOutput p, A arg)
    {
      CPattern cpattern_ = p.cpattern_.accept(this, arg);
      ListPPattern listppattern_ = new ListPPattern();
      for (PPattern x : p.listppattern_)
      {
        listppattern_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PPtOutput(cpattern_, listppattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtInput p, A arg)
    {
      ListPatternBind listpatternbind_ = new ListPatternBind();
      for (PatternBind x : p.listpatternbind_)
      {
        listpatternbind_.add(x.accept(this,arg));
      }
      PPattern ppattern_ = p.ppattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtInput(listpatternbind_, ppattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtMatch p, A arg)
    {
      PPattern ppattern_ = p.ppattern_.accept(this, arg);
      ListPatternPatternMatch listpatternpatternmatch_ = new ListPatternPatternMatch();
      for (PatternPatternMatch x : p.listpatternpatternmatch_)
      {
        listpatternpatternmatch_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PPtMatch(ppattern_, listpatternpatternmatch_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtNew p, A arg)
    {
      ListVarPattern listvarpattern_ = new ListVarPattern();
      for (VarPattern x : p.listvarpattern_)
      {
        listvarpattern_.add(x.accept(this,arg));
      }
      PPattern ppattern_ = p.ppattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtNew(listvarpattern_, ppattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtConstr p, A arg)
    {
      String name_ = p.name_;
      ListPPattern listppattern_ = new ListPPattern();
      for (PPattern x : p.listppattern_)
      {
        listppattern_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.PPtConstr(name_, listppattern_);
    }    public PPattern visit(coop.rchain.syntax.rholang.Absyn.PPtPar p, A arg)
    {
      PPattern ppattern_1 = p.ppattern_1.accept(this, arg);
      PPattern ppattern_2 = p.ppattern_2.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PPtPar(ppattern_1, ppattern_2);
    }
/* CPattern */
    public CPattern visit(coop.rchain.syntax.rholang.Absyn.CPtVar p, A arg)
    {
      VarPattern varpattern_ = p.varpattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.CPtVar(varpattern_);
    }    public CPattern visit(coop.rchain.syntax.rholang.Absyn.CPtQuote p, A arg)
    {
      PPattern ppattern_ = p.ppattern_.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.CPtQuote(ppattern_);
    }
/* PatternBind */
    public PatternBind visit(coop.rchain.syntax.rholang.Absyn.PtBind p, A arg)
    {
      CPattern cpattern_1 = p.cpattern_1.accept(this, arg);
      CPattern cpattern_2 = p.cpattern_2.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PtBind(cpattern_1, cpattern_2);
    }
/* PatternPatternMatch */
    public PatternPatternMatch visit(coop.rchain.syntax.rholang.Absyn.PtBranch p, A arg)
    {
      PPattern ppattern_1 = p.ppattern_1.accept(this, arg);
      PPattern ppattern_2 = p.ppattern_2.accept(this, arg);
      return new coop.rchain.syntax.rholang.Absyn.PtBranch(ppattern_1, ppattern_2);
    }
/* ValPattern */
    public ValPattern visit(coop.rchain.syntax.rholang.Absyn.VPtStruct p, A arg)
    {
      String var_ = p.var_;
      ListPPattern listppattern_ = new ListPPattern();
      for (PPattern x : p.listppattern_)
      {
        listppattern_.add(x.accept(this,arg));
      }
      return new coop.rchain.syntax.rholang.Absyn.VPtStruct(var_, listppattern_);
    }
}