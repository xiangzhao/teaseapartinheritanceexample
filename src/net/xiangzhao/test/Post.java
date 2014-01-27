/**
 * 
 */
package net.xiangzhao.test;

/**
 * @author zhao
 * 
 */
public abstract class Post extends NewsFeedItem {

	private String content;

	/**
	 * Constructor
	 * 
	 * @param content
	 * @param author
	 */
	public Post(String content, String author) {
		this.content = content;
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
		return content;
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
