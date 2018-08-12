package com.er.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.er.dto.StudentDTO;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
public class StudentPdfView extends AbstractPdfView {

	@Override
	public void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		Paragraph p = null;
		Table table = null;
		// get Model Attribute
		List<StudentDTO> listDTO = (List<StudentDTO>) map.get("studList");
		// add paragraph
		p = new Paragraph("Student Report", new Font(Font.BOLD));
		p.setAlignment("center");
		doc.add(p);
		// add table
		table = new Table(4);
		for (StudentDTO dto : listDTO) {
			table.addCell(String.valueOf(dto.getSno()));
			table.addCell(dto.getSname());
			table.addCell(dto.getSadd());
			table.addCell(String.valueOf(dto.getAvg()));
		}
		doc.add(table);

	}

}
