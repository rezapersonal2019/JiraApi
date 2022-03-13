package com.api.demo.JiraApi;

import java.io.IOException;

import com.api.demo.JiraApi.jira.ApiJira;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
   ApiJira jira = new ApiJira();
        
        System.out.println( jira.doGetissue());     
       System.out.println( jira.doGetAllProject());
       System.out.println( jira.doGetAllSprint());
       System.out.println( jira.doGetAllIssueInSprint());
    }
}
