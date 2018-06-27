#ACK: This is the example of custom Toolbar.

**This will help you to use toolbar in your project with some of its property but now you need to write less code.**

**Feature 1:**

     To enable home button the native way is:
     

         getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setDisplayShowHomeEnabled(true);
         
         
     With CustomToolBar you can enable home button in this way :  
     
         app:showHomeButton="true" 
     
     
**Feature 2:**

    To change toolbar title native way is:
    
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle(R.string.app_name);
        
    With CustomToolBar you can change toolbar title:
      
      app:customTitle="@string/app_name"
       


**Example:**


`activity_main.xml`

    <com.aj.user06.customtoolbar.CustomToolBar
      android:id="@+id/my_toolBar"
      ...
      app:showHomeButton="true"            // this will show toolbar home button
      app:customTitle="@string/app_name"  // this will show toolbar title
      >
    </com.aj.user06.customtoolbar.CustomToolBar>
    
    
`MainActivity.java`    

     CustomToolBar customToolBar = findViewById(R.id.my_toolBar);
     setSupportActionBar(customToolBar);
     // you need to add this line to pass  AppCompatActivity context 
     customToolBar.setContext(this);
     
![CustomToolBar](https://github.com/anjandebnath/CustomToolBar/blob/master/Capture.PNG)

