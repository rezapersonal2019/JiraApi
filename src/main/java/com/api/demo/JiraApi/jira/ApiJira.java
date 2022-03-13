package com.api.demo.JiraApi.jira;

import java.io.IOException;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

public class ApiJira {

	
OkHttpClient client = new OkHttpClient();
	
	public String doGetissue() throws  IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/api/2/issue/TP-1")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOlhsVTRiY2tNNERHZ3lRT1ByMWUzM0Q0Mw==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_855ecc7bbf79e2c9e07c06f7bdae3c43b8fcfcd6_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();

	}
	
public String doGetAllProject() throws IOException {
		
		Request request = new Request.Builder()
				  .url("https://selim22.atlassian.net/rest/api/3/project/search")
				  .method("GET", null)
				  .addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOjZuWVhoc1ZyVlFTdnk5cnpLemJQOUQwNQ==")
				  .addHeader("Cookie", "atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_8e6ae7eecf627022c5ad0e21278fca9da9add903_lin")
				  .build();
				Response response = client.newCall(request).execute();
				
				return response.body().string();
	}

	public String doGetAllSprint() throws IOException {

		Request request = new Request.Builder().url("https://selim22.atlassian.net/rest/agile/1.0/board/2/sprint")
				.method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOnNYWGtVRDFkblR2NXEySGlpd1IxRTczRA==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_9eefa70507bf4cc798155055922c756f50aa1ac3_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	public String doGetAllIssueInSprint() throws IOException {

		Request request = new Request.Builder()
				.url("https://selim22.atlassian.net/rest/agile/1.0/board/2/sprint/3/issue").method("GET", null)
				.addHeader("Authorization", "Basic c2VsaW1kLnJlemFAZ21haWwuY29tOnNYWGtVRDFkblR2NXEySGlpd1IxRTczRA==")
				.addHeader("Cookie",
						"atlassian.xsrf.token=9d4964b2-a15a-4258-b990-eaec7078709d_30e1f95340967ba033c75ffef218f5623c5a20ce_lin")
				.build();
		Response response = client.newCall(request).execute();

		return response.body().string();
	}

	
}
