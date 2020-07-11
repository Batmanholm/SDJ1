package opg1;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int d, int m, int y)
  {
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public Date() {
  }

  public void set(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }


  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj) {
    if (obj == null)
      return false;

    Date dateObj = (Date) obj;
    return day == dateObj.day && month == dateObj.month && year == dateObj.year;
  }


  public String toString() {
    return "day: " + day + " month: " + month + " year: " + year;
  }
}