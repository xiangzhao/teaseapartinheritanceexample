/**
 * 
 */
package net.xiangzhao.test;

/**
 * @author zhao
 * 
 */
public class TwitterLink extends Link {

	public TwitterLink(String url, String linktext, String author) {
		super(url, linktext, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String authorLink() {
		// TODO Auto-generated method stub
		return "<a href=\"http://twitter.com/" + this.author + "\">@"
				+ this.author + "</a>";
	}

}
