/**
 * 
 */
package net.xiangzhao.test;

/**
 * @author zhao
 * 
 */
public abstract class NewsFeedItem {

	protected String author;

	protected String content;

	abstract String content();

	abstract String authorLink();

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "<p>" + content() + " -- " + authorLink() + "</p>";
	}

}
