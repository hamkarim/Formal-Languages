
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Thu May 20 17:45:41 CEST 2010
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Thu May 20 17:45:41 CEST 2010
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\010\000\002\002\005\000\002\002\004\000\002\003" +
    "\003\000\002\003\002\000\002\004\005\000\002\004\003" +
    "\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\004\005\001\002\000\004\002\016\001" +
    "\002\000\010\004\005\005\ufffe\007\010\001\002\000\004" +
    "\005\015\001\002\000\006\005\ufffb\006\ufffb\001\002\000" +
    "\006\005\ufffa\006\ufffa\001\002\000\006\005\ufffc\006\ufffc" +
    "\001\002\000\006\005\uffff\006\013\001\002\000\006\004" +
    "\005\007\010\001\002\000\006\005\ufffd\006\ufffd\001\002" +
    "\000\010\002\001\005\001\006\001\001\002\000\004\002" +
    "\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\014\000\004\002\003\001\001\000\002\001\001\000" +
    "\012\002\006\003\005\004\011\005\010\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\006\002\006\005\013\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // e ::= NUMBER 
            {
              Element RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer x = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = new MyNumber(x); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // e ::= s 
            {
              Element RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Element x = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = x;               
              CUP$parser$result = parser.getSymbolFactory().newSymbol("e",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // n ::= e 
            {
              List<Element> RESULT =null;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Element x = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 List<Element> l = new LinkedList<Element>(); 
                            l.add(x);
                            RESULT = l; 
                         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("n",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // n ::= n COMMA e 
            {
              List<Element> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		List<Element> l = (List<Element>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int xleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int xright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Element x = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 l.add(x); RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("n",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // l ::= 
            {
              List<Element> RESULT =null;
		 List<Element> l = new LinkedList<Element>(); 
                            RESULT = l; 
                         
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // l ::= n 
            {
              List<Element> RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		List<Element> l = (List<Element>)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = l; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("l",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Element start_val = (Element)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // s ::= OPEN l CLOSE 
            {
              Element RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<Element> e = (List<Element>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		 RESULT = new MyList(e); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

