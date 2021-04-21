package com.demo.designPatterns;

import com.demo.designPatterns.Sample.SampleBuilder;

public class SampleClient {

	public static void main(String[] args) {
		//create object and set data to the object
		String dignosiscode ="1002L";
		
		Sample sample=	Sample.builder().sampleId(1).sampleName("hemoto").labarotyType("bloood").build();
		
		Sample sample1=	Sample.builder().sampleId(1).sampleName("hemoto").labarotyType("bloood").build();
		System.out.println(sample1);
		
		Sample sample2=	Sample.builder().sampleId(1).sampleName("chemo").labarotyType("cancer").build();
		System.out.println(sample2);
		
		//to set data to field on conditional check
		
		
		SampleBuilder builder = Sample.builder();
		
		builder.sampleId(3);
		builder.labarotyType("cancer");
	
		if(dignosiscode.equals("1001L")) {
			builder.sampleName("chemo");
		}
		else if(dignosiscode.equals("1002L")) {
			builder.sampleName("lazer");
		}
		
		Sample sample3 = builder.build();
		
		System.out.println(sample3);
		

	}

}
