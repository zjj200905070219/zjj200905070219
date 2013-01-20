package main;

import java.io.*;
import java.net.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


class ISBN { 
	String isbnUrl = "http://api.douban.com/book/subject/";
	JSONObject jsonobj;
	Books book;
    /*
     * ���ݴ��ݵ�ͼ��ISBN�����ö���API��ȡjson�ַ���
     */
	public String fetchBookInfoByXML(String isbnNo) throws IOException  {    
	    String requestUrl = isbnUrl + isbnNo+"?alt=json";    
	    URL url = new URL(requestUrl);    
	    URLConnection conn = url.openConnection();    
	    InputStream is = conn.getInputStream();    
	    InputStreamReader isr = new InputStreamReader(is, "utf-8");    
	    BufferedReader br = new BufferedReader(isr);    
	    StringBuilder sb = new StringBuilder();    
	        
	    String line = null;    
	    while ((line = br.readLine()) != null) {    
	        sb.append(line);    
	    }    
	        
	    br.close();    
	    return sb.toString();    
	}
	//��json�ַ���ת��Ϊjson
	public JSONObject stringToJson(String str) throws JSONException
	{
		jsonobj = new JSONObject(str);
		return jsonobj;
	}
	//���û�ȡ��ͼ����Ϣ�����ض���
	public Books setBookData() throws JSONException
	{
		JSONObject mesge = jsonobj.getJSONObject("summary");
		book = new Books();
		book.setSummary(mesge.getString("$t"));//����ͼ���Ҫ��Ϣ
		JSONArray bookMessage = jsonobj.getJSONArray("db:attribute");
		JSONObject info;
		//����ISBN10
		info=bookMessage.getJSONObject(0);
		book.setIsbn10(info.getString("$t"));
		//����ISBN13
		info=bookMessage.getJSONObject(1);
		book.setIsbn13(info.getString("$t"));
		//��������
		info=bookMessage.getJSONObject(2);
		book.setTitle(info.getString("$t"));
		//����ͼ��ҳ��
		info=bookMessage.getJSONObject(3);
		book.setPage(info.getString("$t"));
		//������������
		info=bookMessage.getJSONObject(4);
		book.setAuthor(info.getString("$t"));
		//����ͼ��۸�
		info=bookMessage.getJSONObject(5);
		book.setPrice(info.getString("$t"));
		//���ó�����
		info=bookMessage.getJSONObject(6);
		book.setPublisher(info.getString("$t"));
		//����Paperback
		info=bookMessage.getJSONObject(7);
		book.setBinding(info.getString("$t"));
		//���ó�������
		info=bookMessage.getJSONObject(8);
		book.setPubdate(info.getString("$t"));
		return book;
	}
	
	
	
	
	
	
	
	
	
	
	
}
