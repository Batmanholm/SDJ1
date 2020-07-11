package opg1;

public class Service
{

  private Date date;
  private int mileage;

  public Service(int mileage, Date date)
  {
    this.mileage = mileage;
    this.date = date;
  }

  public int getMileage()
  {
    return mileage;
  }

  public Date getDate()
  {
    return date.copy();
  }

  public boolean equals(Object obj)
  {
    if (obj == null)
      return false;

    Service serviceObj = (Service) obj;
    return mileage == serviceObj.mileage && date.equals(serviceObj.date);
  }

  public String toString()
  {
    return String.format("Service" + "mileage=" + mileage, "Date=" + date );
  }
}
