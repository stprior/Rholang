package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class QDouble extends Quantity {
  public final Double double_;
  public QDouble(Double p1) { double_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Quantity.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.QDouble) {
      coop.rchain.syntax.rholang.Absyn.QDouble x = (coop.rchain.syntax.rholang.Absyn.QDouble)o;
      return this.double_.equals(x.double_);
    }
    return false;
  }

  public int hashCode() {
    return this.double_.hashCode();
  }


}
