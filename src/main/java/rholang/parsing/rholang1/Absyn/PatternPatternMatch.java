package rholang.parsing.rholang1.Absyn; // Java Package generated by the BNF Converter.

public abstract class PatternPatternMatch implements java.io.Serializable {
  public abstract <R,A> R accept(PatternPatternMatch.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(rholang.parsing.rholang1.Absyn.PtBranch p, A arg);

  }

}
