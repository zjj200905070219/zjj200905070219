package main;

public class Books {
  private String summary;
  private String author;
  private String title;
  private String page;
  private String isbn10;
  private String isbn13;
  private String price;
  private String publisher;
  private String binding;
  private String pubdate;
  /**
   * ��ȡͼ���Ҫ��Ϣ
   * ע:�������ϴ���Ҫһ���Ŀռ����ڷ�����ʾ
   * @return String
   */
public String getSummary() {
	return summary;
}
public void setSummary(String summary) {
	this.summary = summary;
}
/**
 * ��ȡ��������
 * @return String
 */
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
/**
 * ��ȡͼ����
 * @return String
 */
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
/**
 * ��ȡͼ��ISBN10����
 * @return String
 */
public String getIsbn10() {
	return isbn10;
}
public void setIsbn10(String isbn10) {
	this.isbn10 = isbn10;
}
/**
 * ��ȡͼ��ISBN13����
 * @return String
 */
public String getIsbn13() {
	return isbn13;
}
public void setIsbn13(String isbn13) {
	this.isbn13 = isbn13;
}
/**
 * ��ȡͼ��۸�
 * @return String
 */
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
/**
 * ��ȡͼ�������
 * @return String
 */
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
/**
 * ��ȡͼ��װ����ʽ
 * @return String
 */
public String getBinding() {
	return binding;
}
public void setBinding(String binding) {
	this.binding = binding;
}
/**
 * ��ȡͼ���������
 * @return String
 */
public String getPubdate() {
	return pubdate;
}
public void setPubdate(String pubdate) {
	this.pubdate = pubdate;
}
public void setPage(String page) {
	this.page = page;
}
/**
 * ��ȡͼ��ҳ��
 * @return String
 */
public String getPage() {
	return page;
}
  
}
