/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.tim.packet;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-22")
public class TimPropertyBean implements org.apache.thrift.TBase<TimPropertyBean, TimPropertyBean._Fields>, java.io.Serializable, Cloneable, Comparable<TimPropertyBean> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimPropertyBean");

  private static final org.apache.thrift.protocol.TField THREAD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("threadId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField INTERFLOW_FIELD_DESC = new org.apache.thrift.protocol.TField("interflow", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TLS_FIELD_DESC = new org.apache.thrift.protocol.TField("tls", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimPropertyBeanStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimPropertyBeanTupleSchemeFactory());
  }

  public String threadId; // optional
  /**
   * ????????????
   */
  public String interflow; // optional
  /**
   * tls
   */
  public String tls; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    THREAD_ID((short)1, "threadId"),
    /**
     * ????????????
     */
    INTERFLOW((short)2, "interflow"),
    /**
     * tls
     */
    TLS((short)3, "tls");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // THREAD_ID
          return THREAD_ID;
        case 2: // INTERFLOW
          return INTERFLOW;
        case 3: // TLS
          return TLS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.THREAD_ID,_Fields.INTERFLOW,_Fields.TLS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.THREAD_ID, new org.apache.thrift.meta_data.FieldMetaData("threadId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INTERFLOW, new org.apache.thrift.meta_data.FieldMetaData("interflow", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TLS, new org.apache.thrift.meta_data.FieldMetaData("tls", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimPropertyBean.class, metaDataMap);
  }

  public TimPropertyBean() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimPropertyBean(TimPropertyBean other) {
    if (other.isSetThreadId()) {
      this.threadId = other.threadId;
    }
    if (other.isSetInterflow()) {
      this.interflow = other.interflow;
    }
    if (other.isSetTls()) {
      this.tls = other.tls;
    }
  }

  public TimPropertyBean deepCopy() {
    return new TimPropertyBean(this);
  }

  @Override
  public void clear() {
    this.threadId = null;
    this.interflow = null;
    this.tls = null;
  }

  public String getThreadId() {
    return this.threadId;
  }

  public TimPropertyBean setThreadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  public void unsetThreadId() {
    this.threadId = null;
  }

  /** Returns true if field threadId is set (has been assigned a value) and false otherwise */
  public boolean isSetThreadId() {
    return this.threadId != null;
  }

  public void setThreadIdIsSet(boolean value) {
    if (!value) {
      this.threadId = null;
    }
  }

  /**
   * ????????????
   */
  public String getInterflow() {
    return this.interflow;
  }

  /**
   * ????????????
   */
  public TimPropertyBean setInterflow(String interflow) {
    this.interflow = interflow;
    return this;
  }

  public void unsetInterflow() {
    this.interflow = null;
  }

  /** Returns true if field interflow is set (has been assigned a value) and false otherwise */
  public boolean isSetInterflow() {
    return this.interflow != null;
  }

  public void setInterflowIsSet(boolean value) {
    if (!value) {
      this.interflow = null;
    }
  }

  /**
   * tls
   */
  public String getTls() {
    return this.tls;
  }

  /**
   * tls
   */
  public TimPropertyBean setTls(String tls) {
    this.tls = tls;
    return this;
  }

  public void unsetTls() {
    this.tls = null;
  }

  /** Returns true if field tls is set (has been assigned a value) and false otherwise */
  public boolean isSetTls() {
    return this.tls != null;
  }

  public void setTlsIsSet(boolean value) {
    if (!value) {
      this.tls = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case THREAD_ID:
      if (value == null) {
        unsetThreadId();
      } else {
        setThreadId((String)value);
      }
      break;

    case INTERFLOW:
      if (value == null) {
        unsetInterflow();
      } else {
        setInterflow((String)value);
      }
      break;

    case TLS:
      if (value == null) {
        unsetTls();
      } else {
        setTls((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case THREAD_ID:
      return getThreadId();

    case INTERFLOW:
      return getInterflow();

    case TLS:
      return getTls();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case THREAD_ID:
      return isSetThreadId();
    case INTERFLOW:
      return isSetInterflow();
    case TLS:
      return isSetTls();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimPropertyBean)
      return this.equals((TimPropertyBean)that);
    return false;
  }

  public boolean equals(TimPropertyBean that) {
    if (that == null)
      return false;

    boolean this_present_threadId = true && this.isSetThreadId();
    boolean that_present_threadId = true && that.isSetThreadId();
    if (this_present_threadId || that_present_threadId) {
      if (!(this_present_threadId && that_present_threadId))
        return false;
      if (!this.threadId.equals(that.threadId))
        return false;
    }

    boolean this_present_interflow = true && this.isSetInterflow();
    boolean that_present_interflow = true && that.isSetInterflow();
    if (this_present_interflow || that_present_interflow) {
      if (!(this_present_interflow && that_present_interflow))
        return false;
      if (!this.interflow.equals(that.interflow))
        return false;
    }

    boolean this_present_tls = true && this.isSetTls();
    boolean that_present_tls = true && that.isSetTls();
    if (this_present_tls || that_present_tls) {
      if (!(this_present_tls && that_present_tls))
        return false;
      if (!this.tls.equals(that.tls))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_threadId = true && (isSetThreadId());
    list.add(present_threadId);
    if (present_threadId)
      list.add(threadId);

    boolean present_interflow = true && (isSetInterflow());
    list.add(present_interflow);
    if (present_interflow)
      list.add(interflow);

    boolean present_tls = true && (isSetTls());
    list.add(present_tls);
    if (present_tls)
      list.add(tls);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimPropertyBean other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetThreadId()).compareTo(other.isSetThreadId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetThreadId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.threadId, other.threadId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInterflow()).compareTo(other.isSetInterflow());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInterflow()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.interflow, other.interflow);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTls()).compareTo(other.isSetTls());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTls()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tls, other.tls);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TimPropertyBean(");
    boolean first = true;

    if (isSetThreadId()) {
      sb.append("threadId:");
      if (this.threadId == null) {
        sb.append("null");
      } else {
        sb.append(this.threadId);
      }
      first = false;
    }
    if (isSetInterflow()) {
      if (!first) sb.append(", ");
      sb.append("interflow:");
      if (this.interflow == null) {
        sb.append("null");
      } else {
        sb.append(this.interflow);
      }
      first = false;
    }
    if (isSetTls()) {
      if (!first) sb.append(", ");
      sb.append("tls:");
      if (this.tls == null) {
        sb.append("null");
      } else {
        sb.append(this.tls);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TimPropertyBeanStandardSchemeFactory implements SchemeFactory {
    public TimPropertyBeanStandardScheme getScheme() {
      return new TimPropertyBeanStandardScheme();
    }
  }

  private static class TimPropertyBeanStandardScheme extends StandardScheme<TimPropertyBean> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimPropertyBean struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // THREAD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.threadId = iprot.readString();
              struct.setThreadIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // INTERFLOW
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.interflow = iprot.readString();
              struct.setInterflowIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TLS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.tls = iprot.readString();
              struct.setTlsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimPropertyBean struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.threadId != null) {
        if (struct.isSetThreadId()) {
          oprot.writeFieldBegin(THREAD_ID_FIELD_DESC);
          oprot.writeString(struct.threadId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.interflow != null) {
        if (struct.isSetInterflow()) {
          oprot.writeFieldBegin(INTERFLOW_FIELD_DESC);
          oprot.writeString(struct.interflow);
          oprot.writeFieldEnd();
        }
      }
      if (struct.tls != null) {
        if (struct.isSetTls()) {
          oprot.writeFieldBegin(TLS_FIELD_DESC);
          oprot.writeString(struct.tls);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimPropertyBeanTupleSchemeFactory implements SchemeFactory {
    public TimPropertyBeanTupleScheme getScheme() {
      return new TimPropertyBeanTupleScheme();
    }
  }

  private static class TimPropertyBeanTupleScheme extends TupleScheme<TimPropertyBean> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimPropertyBean struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetThreadId()) {
        optionals.set(0);
      }
      if (struct.isSetInterflow()) {
        optionals.set(1);
      }
      if (struct.isSetTls()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetThreadId()) {
        oprot.writeString(struct.threadId);
      }
      if (struct.isSetInterflow()) {
        oprot.writeString(struct.interflow);
      }
      if (struct.isSetTls()) {
        oprot.writeString(struct.tls);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimPropertyBean struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.threadId = iprot.readString();
        struct.setThreadIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.interflow = iprot.readString();
        struct.setInterflowIsSet(true);
      }
      if (incoming.get(2)) {
        struct.tls = iprot.readString();
        struct.setTlsIsSet(true);
      }
    }
  }

}

