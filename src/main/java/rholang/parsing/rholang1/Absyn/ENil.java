package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public class ENil extends Expr {
  public ENil() { }

  public <R,A> R accept(rholang.parsing.rholang1.Absyn.Expr.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof rholang.parsing.rholang1.Absyn.ENil) {
      return true;
    }
    return false;
  }

  public int hashCode() {
    return 37;
  }


}
