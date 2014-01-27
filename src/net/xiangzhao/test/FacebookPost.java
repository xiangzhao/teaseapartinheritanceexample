/**
 * 
 */
package net.xiangzhao.test;

/**
 * @author zhao
 * 
 */
public class FacebookPost extends Post {

	public FacebookPost(String content, String author) {
		super(content, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String authorLink() {
		// TODO Auto-generated method stub
		return "<a href=\"http://facebook.com/" + this.author + "\">"
				+ this.author + "</a>";
	}

}
