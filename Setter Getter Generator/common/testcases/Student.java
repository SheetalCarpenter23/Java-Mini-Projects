import java.util.*;
import java.math.*;
class Batch
{

}
class Student
{
private int rollNumber;
private String firstName;
private String lastName;
private String city;
private String state;
private String country;
private Batch batch;
private int height;
private int courseId;
private boolean isIndian;

public Student()
{
this.rollNumber=0;
this.firstName="";
this.lastName="";
this.city="";
this.state="";
this.country="";
this.batch=null;
this.height=0;
this.courseId=0;
this.isIndian=false;
}
public void setRollNumber(int rollNumber)
{
this.rollNumber=rollNumber;
}
public int getRollNumber()
{
return this.rollNumber;
}
public void setFirstName(java.lang.String firstName)
{
this.firstName=firstName;
}
public java.lang.String getFirstName()
{
return this.firstName;
}
public void setLastName(java.lang.String lastName)
{
this.lastName=lastName;
}
public java.lang.String getLastName()
{
return this.lastName;
}
public void setCity(java.lang.String city)
{
this.city=city;
}
public java.lang.String getCity()
{
return this.city;
}
public void setState(java.lang.String state)
{
this.state=state;
}
public java.lang.String getState()
{
return this.state;
}
public void setCountry(java.lang.String country)
{
this.country=country;
}
public java.lang.String getCountry()
{
return this.country;
}
public void setBatch(Batch batch)
{
this.batch=batch;
}
public Batch getBatch()
{
return this.batch;
}
public void setHeight(int height)
{
this.height=height;
}
public int getHeight()
{
return this.height;
}
public void setCourseId(int courseId)
{
this.courseId=courseId;
}
public int getCourseId()
{
return this.courseId;
}
public void setIsIndian(boolean isIndian)
{
this.isIndian=isIndian;
}
public boolean getIsIndian()
{
return this.isIndian;
}


}
