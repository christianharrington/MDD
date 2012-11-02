package org.bimserver.clashdetection.bcf.test;

import java.io.File;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.bimserver.bcf.markup.Comment;
import org.bimserver.bcf.markup.CommentStatus;
import org.bimserver.clashdetection.bcf.Bcf;
import org.bimserver.clashdetection.bcf.BcfException;
import org.bimserver.clashdetection.bcf.Issue;

public class TestBcf {
	public static void main(String[] args) {
		try {
			Bcf bcf = Bcf.read(new File("test/ex1.bcfzip"));
			bcf.write(new File("ex.bcfzip"));

			bcf = Bcf.read(new File("test/test.bcfzip"));
			for (Issue issue : bcf.getIssues()) {
				Comment newComment = new Comment();
				newComment.setGuid(issue.getMarkup().getTopic().getGuid());
				newComment.setAuthor("Ruben de Laat");
				newComment.setComment("Test " + new Random().nextInt());
				newComment.setStatus(CommentStatus.ERROR);
				newComment.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
				issue.getMarkup().getComment().add(newComment);
			}
			bcf.write(new File("test.bcfzip"));

			bcf = Bcf.read(new File("test/notes.bcfzip"));
			for (Issue issue : bcf.getIssues()) {
				Comment newComment = new Comment();
				newComment.setGuid(issue.getMarkup().getTopic().getGuid());
				newComment.setAuthor("Ruben de Laat");
				newComment.setComment("Test " + new Random().nextInt());
				newComment.setStatus(CommentStatus.ERROR);
				newComment.setDate(DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar()));
				issue.getMarkup().getComment().add(newComment);
			}
			bcf.write(new File("notes.bcfzip"));
		} catch (BcfException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
	}
}
