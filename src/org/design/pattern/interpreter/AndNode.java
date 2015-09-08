package org.design.pattern.interpreter;

/**
 * @desciption: No description
 * @author : ��Ӧ��(http://passwarer.github.io/)
 * @date : 2015-9-8����3:23:02
 */
public class AndNode extends AbstractNode{
	
	private AbstractNode left;
	private AbstractNode right;
	
	public AndNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String interpret() {
		// TODO Auto-generated method stub
		return left.interpret()+"����"+right.interpret();
	}
}
