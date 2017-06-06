package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public class VPtStruct extends ValPattern {
  public final String var_;
  public final ListPPattern listppattern_;
  public VPtStruct(String p1, ListPPattern p2) { var_ = p1; listppattern_ = p2; }

  public <R,A> R accept(rholang.parsing.rholang2.Absyn.ValPattern.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang2.Absyn.VPtStruct) {
      rholang.parsing.rholang2.Absyn.VPtStruct x = (rholang.parsing.rholang2.Absyn.VPtStruct)o;
      return this.var_.equals(x.var_) && this.listppattern_.equals(x.listppattern_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(this.var_.hashCode())+this.listppattern_.hashCode();
  }


}
