package rholang.parsing.rholang2.Absyn; // Java Package generated by the BNF Converter.

public abstract class Value implements java.io.Serializable {
  public abstract <R,A> R accept(Value.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.rholang2.Absyn.VQuant p, A arg);
    public R visit(rholang.parsing.rholang2.Absyn.VEnt p, A arg);

  }

}
