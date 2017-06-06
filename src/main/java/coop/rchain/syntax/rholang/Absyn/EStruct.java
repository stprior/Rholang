package coop.rchain.syntax.rholang.Absyn; // Java Package generated by the BNF Converter.

public class EStruct extends Entity {
  public final Struct struct_;
  public EStruct(Struct p1) { struct_ = p1; }

  public <R,A> R accept(coop.rchain.syntax.rholang.Absyn.Entity.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof coop.rchain.syntax.rholang.Absyn.EStruct) {
      coop.rchain.syntax.rholang.Absyn.EStruct x = (coop.rchain.syntax.rholang.Absyn.EStruct)o;
      return this.struct_.equals(x.struct_);
    }
    return false;
  }

  public int hashCode() {
    return this.struct_.hashCode();
  }


}
