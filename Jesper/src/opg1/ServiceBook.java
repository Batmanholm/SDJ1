package opg1;

import java.util.ArrayList;
import java.util.List;

public class ServiceBook
{

  private List<Service> services;

  public ServiceBook()
  {
    services = new ArrayList<>();
  }

  public void addService(Service service)
  {
    services.add(service);
  }


  public int getNumberOfService()
  {
    return services.size();
  }

  public Service getService(int index)
  {
    if (services.size() > index || index < 0) {
      return null;
    }

    return services.get(index);
  }

  public Service[] getAllService()
  {
      return (Service[]) services.toArray();
  }

  public int[] getAllServiceMileages()
  {
    int[] mileages = new int[services.size()];

    for (int i = 0; i < services.size(); i++)
    {
      mileages[i] = services.get(i).getMileage();
    }

    return mileages;
  }

  public boolean hasServiceOnDate(Date date)
  {
    for (int i = 0; i < services.size(); i++)
    {
      if (services.get(i).getDate().equals(date))
      {
        return true;
      }
    }
    return false;
  }

  public Date getDateOfLastService()
  {
    return services.get(services.size()).getDate();
  }


  public boolean equals(Object obj)
  {
    if (obj == null)
      return false;

    ServiceBook sb = (ServiceBook) obj;

    if (sb.services.size() != services.size())
      return false;

    for (int i = 0; i < services.size(); i++)
    {
      if (!sb.services.get(i).equals(services.get(i)))
        return false;
    }
    return true;

  }

  public String toString()
  {
     String outStr = "Services: ";
    for (int i = 0; i < services.size(); i++)
    {
      outStr += services.get(i).toString() + ", ";
    }
    return outStr;
  }
}
