package main;

import java.awt.*;
import java.awt.event.*;
import java.awt.Frame;
import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class ViewWindow {
	


	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame("����ͼ������");
		f.setLocation(300, 300);
		f.setSize(500, 500);
		f.setVisible(true);
		f.setLayout(new GridLayout(10,2));
		//��������ͼ��ISBN����
		final TextField id = new TextField("����ͼ��ISBN:",10);
		f.add(id);
		Button butt = new Button("����");
		f.add(butt);
		
		//
		final TextField bookName = new TextField("ͼ����",10);
		f.add(new Label("ͼ����:",Label.CENTER));
		f.add(bookName);
		//
		final TextField authorName = new TextField("ͼ������",10);
		f.add(new Label("ͼ������:",Label.CENTER));
		f.add(authorName);
		//
		final TextField bookIsbn10 = new TextField("ͼ��ISBN10��",10);
		f.add(new Label("ͼ��ISBN10��:",Label.CENTER));
		f.add(bookIsbn10);
		//
		final TextField bookIsbn13 = new TextField("ͼ��ISBN13��",10);
		f.add(new Label("ͼ��ISBN13��:",Label.CENTER));
		f.add(bookIsbn13);
		//
		final TextField bookPage = new TextField("ͼ��ҳ��",10);
		f.add(new Label("ͼ��ҳ��:",Label.CENTER));
		f.add(bookPage);
		//
		final TextField bookPrice = new TextField("ͼ��۸�",10);
		f.add(new Label("ͼ��۸�:",Label.CENTER));
		f.add(bookPrice);
		//
		final TextField bookBinding = new TextField("ͼ��װ����ʽ",10);
		f.add(new Label("ͼ��װ����ʽ:",Label.CENTER));
		f.add(bookBinding);
		//
		final TextField publisher = new TextField("ͼ�������",10);
		f.add(new Label("ͼ�������:",Label.CENTER));
		f.add(publisher);
		//
		final TextField pubdate = new TextField("ͼ���������",10);
		f.add(new Label("ͼ���������:",Label.CENTER));
		f.add(pubdate);
		//
		final TextField bookDetail = new TextField("ͼ�����ݸ�Ҫ",10);
		f.add(new Label("ͼ�����ݸ�Ҫ:",Label.CENTER));
		f.add(bookDetail);
		//���ð�ť����
		butt.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Books book;
				ISBN isbnTest = new ISBN();
				String isbn = id.getText();//��ȡ�����ͼ��ISBN��
				String bookjson;
				try {
					bookjson = isbnTest.fetchBookInfoByXML(isbn);
					JSONObject jsonobj=isbnTest.stringToJson(bookjson);				    
				    book = (Books)isbnTest.setBookData();
				    bookName.setText(book.getTitle());
				    authorName.setText(book.getAuthor());
				    bookIsbn10.setText(book.getIsbn10());
				    bookIsbn13.setText(book.getIsbn13());
				    bookBinding.setText(book.getBinding());
				    bookDetail.setText(book.getSummary());
				    bookPage.setText(book.getPage());
				    bookPrice.setText(book.getPrice());
				    publisher.setText(book.getPublisher());
				    pubdate.setText(book.getPubdate());
				    
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (JSONException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			    
			}
		});
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent args) {
			   System.exit(0);
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
