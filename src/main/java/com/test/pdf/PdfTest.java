package com.test.pdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfTest {

	/**
	 * 生成pdf
	 */
	public void generatePDF() {
		try {
			// 1.创建一个document
			Document document = new Document();

			// 2.定义pdfWriter，指明文件输出流输出到一个文件
			PdfWriter.getInstance(document, new FileOutputStream("/Users/dingshuai/Desktop/test.pdf"));

			// 3.打开文档
			document.open();

			// 字体
			Font font = new Font();
			font.setFamily("STSongStd-Light");
			// 4.添加内容
			Paragraph content = new Paragraph("xxx!", font);

			document.add(content);

			// 添加段落
			for (int i = 0; i < 100; i++) {
				document.add(new Paragraph("你好世界" + "," + "你好 iText" + "," + "HelloxDuan"));
			}

			// 5.关闭
			document.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createPDF(){
		// 页面大小
        Rectangle rect = new Rectangle(PageSize.B5.rotate());
        // 页面背景色
        rect.setBackgroundColor(BaseColor.WHITE);
        // 创建一个文档
        Document document = new Document(rect);
        try {
            // 获取PdfWriter实例
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("/Users/dingshuai/Desktop/test.pdf"));

            // PDF版本(默认1.4)
            writer.setPdfVersion(PdfWriter.PDF_VERSION_1_7);

            // 文档属性
            document.addTitle("测试文档标题");
            document.addAuthor("张三");
            document.addSubject("PDF测试");
            document.addKeywords("pdf");
            document.addCreator("张三");

            // 页边空白
            document.setMargins(10, 20, 30, 40);

            // 解决中文支持问题
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            com.itextpdf.text.Font fontChinese = new com.itextpdf.text.Font(bfChinese, 12, com.itextpdf.text.Font.NORMAL);

            // 标题
            Paragraph toptile = new Paragraph("标题", new Font(bfChinese, 14, Font.NORMAL));
            toptile.setAlignment(Paragraph.ALIGN_CENTER);
            toptile.add(new Paragraph("   "));

            
            Paragraph pragraph = new Paragraph("这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落，这是一个段落", fontChinese);
            pragraph.setAlignment(Element.ALIGN_LEFT);
            pragraph.add(new Paragraph("   "));

        

            // 添加表格
            PdfPTable table = new PdfPTable(4);
            String content = "你好 : ";
            for (int i = 0; i < 200; i++)
                table.addCell(new Phrase(new Chunk(content + i, fontChinese)));

            // 使用 HttpServletResponse 进行下载
//            response.setContentType("application/pdf; charset=UTF-8");
//            response.setHeader("Content-Disposition", "inline; filename=" + new String("test.pdf".getBytes(), "UTF-8"));
//            PdfWriter.getInstance(document, response.getOutputStream());
            
            // 打开文档
            document.open();
            
            // 添加内容
            document.add(toptile);
            document.add(pragraph);
            document.add(table);
            // 关闭文档
            document.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	/**
	 * 以2进制方式读出pdf内容
	 */
	public void readPFD() {
		try {
			FileInputStream in = new FileInputStream(new File("/Users/dingshuai/Desktop/test.pdf"));
			int xx = in.read();
			while (xx != -1) {
				System.out.print((char) xx);
				xx = in.read();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		PdfTest test = new PdfTest();
		test.generatePDF();
//		test.createPDF();
//		test.readPFD();
	}
}
