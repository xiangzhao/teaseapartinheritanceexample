/**
 * 
 */
package net.xiangzhao.test;

/**
 * @author zhao
 * 
 */
public abstract class Link extends NewsFeedItem {

	private String url;
	private String linkText;

	public Link(String url, String linktext, String author) {
		this.url = url;
		this.linkText = linktext;
		this.author = author;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.xiangzhao.test.NewsFeedItem#content()
	 */
	@Override
	protected String content() {
		// TODO Auto-generated method stub
		return "<a href=\"" + url + "\">" + linkText + "</a>";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.xiangzhao.test.NewsFeedItem#authorLink()
	 */
	@Override
	protected String authorLink() {
		// TODO Auto-generated method stub
		return null;
	}

}
