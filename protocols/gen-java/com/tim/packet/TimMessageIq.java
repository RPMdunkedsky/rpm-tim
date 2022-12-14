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
public class TimMessageIq implements org.apache.thrift.TBase<TimMessageIq, TimMessageIq._Fields>, java.io.Serializable, Cloneable, Comparable<TimMessageIq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TimMessageIq");

  private static final org.apache.thrift.protocol.TField TIDLIST_FIELD_DESC = new org.apache.thrift.protocol.TField("tidlist", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField TIM_PAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("timPage", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField MIDLIST_FIELD_DESC = new org.apache.thrift.protocol.TField("midlist", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField EXTRA_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("extraMap", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TimMessageIqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TimMessageIqTupleSchemeFactory());
  }

  /**
   * tid??????
   */
  public List<String> tidlist; // optional
  /**
   * ??????
   */
  public TimPage timPage; // optional
  /**
   * mid??????
   */
  public List<String> midlist; // optional
  public Map<String,String> extraMap; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * tid??????
     */
    TIDLIST((short)1, "tidlist"),
    /**
     * ??????
     */
    TIM_PAGE((short)2, "timPage"),
    /**
     * mid??????
     */
    MIDLIST((short)3, "midlist"),
    EXTRA_MAP((short)4, "extraMap");

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
        case 1: // TIDLIST
          return TIDLIST;
        case 2: // TIM_PAGE
          return TIM_PAGE;
        case 3: // MIDLIST
          return MIDLIST;
        case 4: // EXTRA_MAP
          return EXTRA_MAP;
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
  private static final _Fields optionals[] = {_Fields.TIDLIST,_Fields.TIM_PAGE,_Fields.MIDLIST,_Fields.EXTRA_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIDLIST, new org.apache.thrift.meta_data.FieldMetaData("tidlist", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.TIM_PAGE, new org.apache.thrift.meta_data.FieldMetaData("timPage", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TimPage.class)));
    tmpMap.put(_Fields.MIDLIST, new org.apache.thrift.meta_data.FieldMetaData("midlist", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.EXTRA_MAP, new org.apache.thrift.meta_data.FieldMetaData("extraMap", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TimMessageIq.class, metaDataMap);
  }

  public TimMessageIq() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TimMessageIq(TimMessageIq other) {
    if (other.isSetTidlist()) {
      List<String> __this__tidlist = new ArrayList<String>(other.tidlist);
      this.tidlist = __this__tidlist;
    }
    if (other.isSetTimPage()) {
      this.timPage = new TimPage(other.timPage);
    }
    if (other.isSetMidlist()) {
      List<String> __this__midlist = new ArrayList<String>(other.midlist);
      this.midlist = __this__midlist;
    }
    if (other.isSetExtraMap()) {
      Map<String,String> __this__extraMap = new HashMap<String,String>(other.extraMap);
      this.extraMap = __this__extraMap;
    }
  }

  public TimMessageIq deepCopy() {
    return new TimMessageIq(this);
  }

  @Override
  public void clear() {
    this.tidlist = null;
    this.timPage = null;
    this.midlist = null;
    this.extraMap = null;
  }

  public int getTidlistSize() {
    return (this.tidlist == null) ? 0 : this.tidlist.size();
  }

  public java.util.Iterator<String> getTidlistIterator() {
    return (this.tidlist == null) ? null : this.tidlist.iterator();
  }

  public void addToTidlist(String elem) {
    if (this.tidlist == null) {
      this.tidlist = new ArrayList<String>();
    }
    this.tidlist.add(elem);
  }

  /**
   * tid??????
   */
  public List<String> getTidlist() {
    return this.tidlist;
  }

  /**
   * tid??????
   */
  public TimMessageIq setTidlist(List<String> tidlist) {
    this.tidlist = tidlist;
    return this;
  }

  public void unsetTidlist() {
    this.tidlist = null;
  }

  /** Returns true if field tidlist is set (has been assigned a value) and false otherwise */
  public boolean isSetTidlist() {
    return this.tidlist != null;
  }

  public void setTidlistIsSet(boolean value) {
    if (!value) {
      this.tidlist = null;
    }
  }

  /**
   * ??????
   */
  public TimPage getTimPage() {
    return this.timPage;
  }

  /**
   * ??????
   */
  public TimMessageIq setTimPage(TimPage timPage) {
    this.timPage = timPage;
    return this;
  }

  public void unsetTimPage() {
    this.timPage = null;
  }

  /** Returns true if field timPage is set (has been assigned a value) and false otherwise */
  public boolean isSetTimPage() {
    return this.timPage != null;
  }

  public void setTimPageIsSet(boolean value) {
    if (!value) {
      this.timPage = null;
    }
  }

  public int getMidlistSize() {
    return (this.midlist == null) ? 0 : this.midlist.size();
  }

  public java.util.Iterator<String> getMidlistIterator() {
    return (this.midlist == null) ? null : this.midlist.iterator();
  }

  public void addToMidlist(String elem) {
    if (this.midlist == null) {
      this.midlist = new ArrayList<String>();
    }
    this.midlist.add(elem);
  }

  /**
   * mid??????
   */
  public List<String> getMidlist() {
    return this.midlist;
  }

  /**
   * mid??????
   */
  public TimMessageIq setMidlist(List<String> midlist) {
    this.midlist = midlist;
    return this;
  }

  public void unsetMidlist() {
    this.midlist = null;
  }

  /** Returns true if field midlist is set (has been assigned a value) and false otherwise */
  public boolean isSetMidlist() {
    return this.midlist != null;
  }

  public void setMidlistIsSet(boolean value) {
    if (!value) {
      this.midlist = null;
    }
  }

  public int getExtraMapSize() {
    return (this.extraMap == null) ? 0 : this.extraMap.size();
  }

  public void putToExtraMap(String key, String val) {
    if (this.extraMap == null) {
      this.extraMap = new HashMap<String,String>();
    }
    this.extraMap.put(key, val);
  }

  public Map<String,String> getExtraMap() {
    return this.extraMap;
  }

  public TimMessageIq setExtraMap(Map<String,String> extraMap) {
    this.extraMap = extraMap;
    return this;
  }

  public void unsetExtraMap() {
    this.extraMap = null;
  }

  /** Returns true if field extraMap is set (has been assigned a value) and false otherwise */
  public boolean isSetExtraMap() {
    return this.extraMap != null;
  }

  public void setExtraMapIsSet(boolean value) {
    if (!value) {
      this.extraMap = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIDLIST:
      if (value == null) {
        unsetTidlist();
      } else {
        setTidlist((List<String>)value);
      }
      break;

    case TIM_PAGE:
      if (value == null) {
        unsetTimPage();
      } else {
        setTimPage((TimPage)value);
      }
      break;

    case MIDLIST:
      if (value == null) {
        unsetMidlist();
      } else {
        setMidlist((List<String>)value);
      }
      break;

    case EXTRA_MAP:
      if (value == null) {
        unsetExtraMap();
      } else {
        setExtraMap((Map<String,String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIDLIST:
      return getTidlist();

    case TIM_PAGE:
      return getTimPage();

    case MIDLIST:
      return getMidlist();

    case EXTRA_MAP:
      return getExtraMap();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIDLIST:
      return isSetTidlist();
    case TIM_PAGE:
      return isSetTimPage();
    case MIDLIST:
      return isSetMidlist();
    case EXTRA_MAP:
      return isSetExtraMap();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TimMessageIq)
      return this.equals((TimMessageIq)that);
    return false;
  }

  public boolean equals(TimMessageIq that) {
    if (that == null)
      return false;

    boolean this_present_tidlist = true && this.isSetTidlist();
    boolean that_present_tidlist = true && that.isSetTidlist();
    if (this_present_tidlist || that_present_tidlist) {
      if (!(this_present_tidlist && that_present_tidlist))
        return false;
      if (!this.tidlist.equals(that.tidlist))
        return false;
    }

    boolean this_present_timPage = true && this.isSetTimPage();
    boolean that_present_timPage = true && that.isSetTimPage();
    if (this_present_timPage || that_present_timPage) {
      if (!(this_present_timPage && that_present_timPage))
        return false;
      if (!this.timPage.equals(that.timPage))
        return false;
    }

    boolean this_present_midlist = true && this.isSetMidlist();
    boolean that_present_midlist = true && that.isSetMidlist();
    if (this_present_midlist || that_present_midlist) {
      if (!(this_present_midlist && that_present_midlist))
        return false;
      if (!this.midlist.equals(that.midlist))
        return false;
    }

    boolean this_present_extraMap = true && this.isSetExtraMap();
    boolean that_present_extraMap = true && that.isSetExtraMap();
    if (this_present_extraMap || that_present_extraMap) {
      if (!(this_present_extraMap && that_present_extraMap))
        return false;
      if (!this.extraMap.equals(that.extraMap))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_tidlist = true && (isSetTidlist());
    list.add(present_tidlist);
    if (present_tidlist)
      list.add(tidlist);

    boolean present_timPage = true && (isSetTimPage());
    list.add(present_timPage);
    if (present_timPage)
      list.add(timPage);

    boolean present_midlist = true && (isSetMidlist());
    list.add(present_midlist);
    if (present_midlist)
      list.add(midlist);

    boolean present_extraMap = true && (isSetExtraMap());
    list.add(present_extraMap);
    if (present_extraMap)
      list.add(extraMap);

    return list.hashCode();
  }

  @Override
  public int compareTo(TimMessageIq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTidlist()).compareTo(other.isSetTidlist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTidlist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tidlist, other.tidlist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimPage()).compareTo(other.isSetTimPage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimPage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timPage, other.timPage);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMidlist()).compareTo(other.isSetMidlist());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMidlist()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.midlist, other.midlist);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExtraMap()).compareTo(other.isSetExtraMap());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExtraMap()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.extraMap, other.extraMap);
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
    StringBuilder sb = new StringBuilder("TimMessageIq(");
    boolean first = true;

    if (isSetTidlist()) {
      sb.append("tidlist:");
      if (this.tidlist == null) {
        sb.append("null");
      } else {
        sb.append(this.tidlist);
      }
      first = false;
    }
    if (isSetTimPage()) {
      if (!first) sb.append(", ");
      sb.append("timPage:");
      if (this.timPage == null) {
        sb.append("null");
      } else {
        sb.append(this.timPage);
      }
      first = false;
    }
    if (isSetMidlist()) {
      if (!first) sb.append(", ");
      sb.append("midlist:");
      if (this.midlist == null) {
        sb.append("null");
      } else {
        sb.append(this.midlist);
      }
      first = false;
    }
    if (isSetExtraMap()) {
      if (!first) sb.append(", ");
      sb.append("extraMap:");
      if (this.extraMap == null) {
        sb.append("null");
      } else {
        sb.append(this.extraMap);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (timPage != null) {
      timPage.validate();
    }
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

  private static class TimMessageIqStandardSchemeFactory implements SchemeFactory {
    public TimMessageIqStandardScheme getScheme() {
      return new TimMessageIqStandardScheme();
    }
  }

  private static class TimMessageIqStandardScheme extends StandardScheme<TimMessageIq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TimMessageIq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIDLIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list272 = iprot.readListBegin();
                struct.tidlist = new ArrayList<String>(_list272.size);
                String _elem273;
                for (int _i274 = 0; _i274 < _list272.size; ++_i274)
                {
                  _elem273 = iprot.readString();
                  struct.tidlist.add(_elem273);
                }
                iprot.readListEnd();
              }
              struct.setTidlistIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIM_PAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.timPage = new TimPage();
              struct.timPage.read(iprot);
              struct.setTimPageIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // MIDLIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list275 = iprot.readListBegin();
                struct.midlist = new ArrayList<String>(_list275.size);
                String _elem276;
                for (int _i277 = 0; _i277 < _list275.size; ++_i277)
                {
                  _elem276 = iprot.readString();
                  struct.midlist.add(_elem276);
                }
                iprot.readListEnd();
              }
              struct.setMidlistIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EXTRA_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map278 = iprot.readMapBegin();
                struct.extraMap = new HashMap<String,String>(2*_map278.size);
                String _key279;
                String _val280;
                for (int _i281 = 0; _i281 < _map278.size; ++_i281)
                {
                  _key279 = iprot.readString();
                  _val280 = iprot.readString();
                  struct.extraMap.put(_key279, _val280);
                }
                iprot.readMapEnd();
              }
              struct.setExtraMapIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TimMessageIq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.tidlist != null) {
        if (struct.isSetTidlist()) {
          oprot.writeFieldBegin(TIDLIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.tidlist.size()));
            for (String _iter282 : struct.tidlist)
            {
              oprot.writeString(_iter282);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.timPage != null) {
        if (struct.isSetTimPage()) {
          oprot.writeFieldBegin(TIM_PAGE_FIELD_DESC);
          struct.timPage.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.midlist != null) {
        if (struct.isSetMidlist()) {
          oprot.writeFieldBegin(MIDLIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.midlist.size()));
            for (String _iter283 : struct.midlist)
            {
              oprot.writeString(_iter283);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.extraMap != null) {
        if (struct.isSetExtraMap()) {
          oprot.writeFieldBegin(EXTRA_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.extraMap.size()));
            for (Map.Entry<String, String> _iter284 : struct.extraMap.entrySet())
            {
              oprot.writeString(_iter284.getKey());
              oprot.writeString(_iter284.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TimMessageIqTupleSchemeFactory implements SchemeFactory {
    public TimMessageIqTupleScheme getScheme() {
      return new TimMessageIqTupleScheme();
    }
  }

  private static class TimMessageIqTupleScheme extends TupleScheme<TimMessageIq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TimMessageIq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTidlist()) {
        optionals.set(0);
      }
      if (struct.isSetTimPage()) {
        optionals.set(1);
      }
      if (struct.isSetMidlist()) {
        optionals.set(2);
      }
      if (struct.isSetExtraMap()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTidlist()) {
        {
          oprot.writeI32(struct.tidlist.size());
          for (String _iter285 : struct.tidlist)
          {
            oprot.writeString(_iter285);
          }
        }
      }
      if (struct.isSetTimPage()) {
        struct.timPage.write(oprot);
      }
      if (struct.isSetMidlist()) {
        {
          oprot.writeI32(struct.midlist.size());
          for (String _iter286 : struct.midlist)
          {
            oprot.writeString(_iter286);
          }
        }
      }
      if (struct.isSetExtraMap()) {
        {
          oprot.writeI32(struct.extraMap.size());
          for (Map.Entry<String, String> _iter287 : struct.extraMap.entrySet())
          {
            oprot.writeString(_iter287.getKey());
            oprot.writeString(_iter287.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TimMessageIq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list288 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.tidlist = new ArrayList<String>(_list288.size);
          String _elem289;
          for (int _i290 = 0; _i290 < _list288.size; ++_i290)
          {
            _elem289 = iprot.readString();
            struct.tidlist.add(_elem289);
          }
        }
        struct.setTidlistIsSet(true);
      }
      if (incoming.get(1)) {
        struct.timPage = new TimPage();
        struct.timPage.read(iprot);
        struct.setTimPageIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list291 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.midlist = new ArrayList<String>(_list291.size);
          String _elem292;
          for (int _i293 = 0; _i293 < _list291.size; ++_i293)
          {
            _elem292 = iprot.readString();
            struct.midlist.add(_elem292);
          }
        }
        struct.setMidlistIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map294 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.extraMap = new HashMap<String,String>(2*_map294.size);
          String _key295;
          String _val296;
          for (int _i297 = 0; _i297 < _map294.size; ++_i297)
          {
            _key295 = iprot.readString();
            _val296 = iprot.readString();
            struct.extraMap.put(_key295, _val296);
          }
        }
        struct.setExtraMapIsSet(true);
      }
    }
  }

}

