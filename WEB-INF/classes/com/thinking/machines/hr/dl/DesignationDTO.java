package com.thinking.machines.hr.dl;
public class DesignationDTO implements java.io.Serializable,Comparable<DesignationDTO>
{
private String title;
private int code;
public DesignationDTO()
{
this.title ="";
this.code=0;
}
public void setTitle(String title)
{
this.title = title;
}
public String getTitle()
{
return this.title;
}
public void setCode(int code)
{
this.code= code;
}
public int getCode()
{
return this.code;
}
public boolean equals(Object object)
{
if(!(object instanceof DesignationDTO)) return false;
DesignationDTO other = (DesignationDTO)object;
return other.getCode()==this.code;
}
public int compareTo(DesignationDTO other)
{
return this.title.compareToIgnoreCase(other.title);
}
public int hashCode()
{
return this.code;
}
}