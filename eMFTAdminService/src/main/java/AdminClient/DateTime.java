/**
 * DateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Jul 11, 2014 (12:11:36 EDT) WSDL2Java emitter.
 */

package AdminClient;

public class DateTime  implements java.io.Serializable {
    private int day;

    private int hour;

    private int minute;

    private int month;

    private int second;

    private int year;

    public DateTime() {
    }

    public DateTime(
           int day,
           int hour,
           int minute,
           int month,
           int second,
           int year) {
           this.day = day;
           this.hour = hour;
           this.minute = minute;
           this.month = month;
           this.second = second;
           this.year = year;
    }


    /**
     * Gets the day value for this DateTime.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this DateTime.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the hour value for this DateTime.
     * 
     * @return hour
     */
    public int getHour() {
        return hour;
    }


    /**
     * Sets the hour value for this DateTime.
     * 
     * @param hour
     */
    public void setHour(int hour) {
        this.hour = hour;
    }


    /**
     * Gets the minute value for this DateTime.
     * 
     * @return minute
     */
    public int getMinute() {
        return minute;
    }


    /**
     * Sets the minute value for this DateTime.
     * 
     * @param minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }


    /**
     * Gets the month value for this DateTime.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this DateTime.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the second value for this DateTime.
     * 
     * @return second
     */
    public int getSecond() {
        return second;
    }


    /**
     * Sets the second value for this DateTime.
     * 
     * @param second
     */
    public void setSecond(int second) {
        this.second = second;
    }


    /**
     * Gets the year value for this DateTime.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this DateTime.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DateTime)) return false;
        DateTime other = (DateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.day == other.getDay() &&
            this.hour == other.getHour() &&
            this.minute == other.getMinute() &&
            this.month == other.getMonth() &&
            this.second == other.getSecond() &&
            this.year == other.getYear();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getDay();
        _hashCode += getHour();
        _hashCode += getMinute();
        _hashCode += getMonth();
        _hashCode += getSecond();
        _hashCode += getYear();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AdministratorService", "DateTime"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hour");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("second");
        elemField.setXmlName(new javax.xml.namespace.QName("", "second"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
