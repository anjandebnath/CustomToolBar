#ACK: This is the example of custom Toolbar.

**This will help you to use toolbar in your project with some of its property but now you need to write less code.**

**Example:**

`activity_main.xml`

    <com.aj.user06.customtoolbar.CustomToolBar
      android:id="@+id/my_toolBar"
      ...
      app:showHomeButton="true"
      app:customTitle="@string/app_name">
    </com.aj.user06.customtoolbar.CustomToolBar>
    
    
`MainActivity.java`    

     CustomToolBar customToolBar = findViewById(R.id.my_toolBar);
     setSupportActionBar(customToolBar);
     // you need to add this line to pass  AppCompatActivity context 
     customToolBar.setContext(this);
     
![CustomToolBar](https://github.com/anjandebnath/CustomToolBar/blob/master/Capture.PNG)

