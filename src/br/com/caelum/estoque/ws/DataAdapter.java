package br.com.caelum.estoque.ws;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DataAdapter extends XmlAdapter<String, Date> {

	private String pattern = "dd/MM/yyyy";

	@Override
	public String marshal(Date date) throws Exception {
		return new SimpleDateFormat(pattern).format(date);
	}

	@Override
	public Date unmarshal(String dateString) throws Exception {
        System.out.println(dateString);
        return new SimpleDateFormat(pattern).parse(dateString);
	}
	
}
