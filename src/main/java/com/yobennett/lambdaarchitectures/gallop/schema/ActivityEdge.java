/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.yobennett.lambdaarchitectures.gallop.schema;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ActivityEdge implements org.apache.thrift.TBase<ActivityEdge, ActivityEdge._Fields>, java.io.Serializable, Cloneable, Comparable<ActivityEdge> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ActivityEdge");

  private static final org.apache.thrift.protocol.TField HORSE_FIELD_DESC = new org.apache.thrift.protocol.TField("horse", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField MONITOR_FIELD_DESC = new org.apache.thrift.protocol.TField("monitor", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INTENSITY_FIELD_DESC = new org.apache.thrift.protocol.TField("intensity", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("time", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField NONCE_FIELD_DESC = new org.apache.thrift.protocol.TField("nonce", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ActivityEdgeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ActivityEdgeTupleSchemeFactory());
  }

  public HorseID horse; // required
  public MonitorID monitor; // required
  public int intensity; // required
  public int time; // required
  public long nonce; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HORSE((short)1, "horse"),
    MONITOR((short)2, "monitor"),
    INTENSITY((short)3, "intensity"),
    TIME((short)4, "time"),
    NONCE((short)5, "nonce");

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
        case 1: // HORSE
          return HORSE;
        case 2: // MONITOR
          return MONITOR;
        case 3: // INTENSITY
          return INTENSITY;
        case 4: // TIME
          return TIME;
        case 5: // NONCE
          return NONCE;
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
  private static final int __INTENSITY_ISSET_ID = 0;
  private static final int __TIME_ISSET_ID = 1;
  private static final int __NONCE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HORSE, new org.apache.thrift.meta_data.FieldMetaData("horse", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, HorseID.class)));
    tmpMap.put(_Fields.MONITOR, new org.apache.thrift.meta_data.FieldMetaData("monitor", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, MonitorID.class)));
    tmpMap.put(_Fields.INTENSITY, new org.apache.thrift.meta_data.FieldMetaData("intensity", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TIME, new org.apache.thrift.meta_data.FieldMetaData("time", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.NONCE, new org.apache.thrift.meta_data.FieldMetaData("nonce", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ActivityEdge.class, metaDataMap);
  }

  public ActivityEdge() {
  }

  public ActivityEdge(
    HorseID horse,
    MonitorID monitor,
    int intensity,
    int time,
    long nonce)
  {
    this();
    this.horse = horse;
    this.monitor = monitor;
    this.intensity = intensity;
    setIntensityIsSet(true);
    this.time = time;
    setTimeIsSet(true);
    this.nonce = nonce;
    setNonceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ActivityEdge(ActivityEdge other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetHorse()) {
      this.horse = new HorseID(other.horse);
    }
    if (other.isSetMonitor()) {
      this.monitor = new MonitorID(other.monitor);
    }
    this.intensity = other.intensity;
    this.time = other.time;
    this.nonce = other.nonce;
  }

  public ActivityEdge deepCopy() {
    return new ActivityEdge(this);
  }

  @Override
  public void clear() {
    this.horse = null;
    this.monitor = null;
    setIntensityIsSet(false);
    this.intensity = 0;
    setTimeIsSet(false);
    this.time = 0;
    setNonceIsSet(false);
    this.nonce = 0;
  }

  public HorseID getHorse() {
    return this.horse;
  }

  public ActivityEdge setHorse(HorseID horse) {
    this.horse = horse;
    return this;
  }

  public void unsetHorse() {
    this.horse = null;
  }

  /** Returns true if field horse is set (has been assigned a value) and false otherwise */
  public boolean isSetHorse() {
    return this.horse != null;
  }

  public void setHorseIsSet(boolean value) {
    if (!value) {
      this.horse = null;
    }
  }

  public MonitorID getMonitor() {
    return this.monitor;
  }

  public ActivityEdge setMonitor(MonitorID monitor) {
    this.monitor = monitor;
    return this;
  }

  public void unsetMonitor() {
    this.monitor = null;
  }

  /** Returns true if field monitor is set (has been assigned a value) and false otherwise */
  public boolean isSetMonitor() {
    return this.monitor != null;
  }

  public void setMonitorIsSet(boolean value) {
    if (!value) {
      this.monitor = null;
    }
  }

  public int getIntensity() {
    return this.intensity;
  }

  public ActivityEdge setIntensity(int intensity) {
    this.intensity = intensity;
    setIntensityIsSet(true);
    return this;
  }

  public void unsetIntensity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __INTENSITY_ISSET_ID);
  }

  /** Returns true if field intensity is set (has been assigned a value) and false otherwise */
  public boolean isSetIntensity() {
    return EncodingUtils.testBit(__isset_bitfield, __INTENSITY_ISSET_ID);
  }

  public void setIntensityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __INTENSITY_ISSET_ID, value);
  }

  public int getTime() {
    return this.time;
  }

  public ActivityEdge setTime(int time) {
    this.time = time;
    setTimeIsSet(true);
    return this;
  }

  public void unsetTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  /** Returns true if field time is set (has been assigned a value) and false otherwise */
  public boolean isSetTime() {
    return EncodingUtils.testBit(__isset_bitfield, __TIME_ISSET_ID);
  }

  public void setTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIME_ISSET_ID, value);
  }

  public long getNonce() {
    return this.nonce;
  }

  public ActivityEdge setNonce(long nonce) {
    this.nonce = nonce;
    setNonceIsSet(true);
    return this;
  }

  public void unsetNonce() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  /** Returns true if field nonce is set (has been assigned a value) and false otherwise */
  public boolean isSetNonce() {
    return EncodingUtils.testBit(__isset_bitfield, __NONCE_ISSET_ID);
  }

  public void setNonceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NONCE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HORSE:
      if (value == null) {
        unsetHorse();
      } else {
        setHorse((HorseID)value);
      }
      break;

    case MONITOR:
      if (value == null) {
        unsetMonitor();
      } else {
        setMonitor((MonitorID)value);
      }
      break;

    case INTENSITY:
      if (value == null) {
        unsetIntensity();
      } else {
        setIntensity((Integer)value);
      }
      break;

    case TIME:
      if (value == null) {
        unsetTime();
      } else {
        setTime((Integer)value);
      }
      break;

    case NONCE:
      if (value == null) {
        unsetNonce();
      } else {
        setNonce((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HORSE:
      return getHorse();

    case MONITOR:
      return getMonitor();

    case INTENSITY:
      return Integer.valueOf(getIntensity());

    case TIME:
      return Integer.valueOf(getTime());

    case NONCE:
      return Long.valueOf(getNonce());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HORSE:
      return isSetHorse();
    case MONITOR:
      return isSetMonitor();
    case INTENSITY:
      return isSetIntensity();
    case TIME:
      return isSetTime();
    case NONCE:
      return isSetNonce();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ActivityEdge)
      return this.equals((ActivityEdge)that);
    return false;
  }

  public boolean equals(ActivityEdge that) {
    if (that == null)
      return false;

    boolean this_present_horse = true && this.isSetHorse();
    boolean that_present_horse = true && that.isSetHorse();
    if (this_present_horse || that_present_horse) {
      if (!(this_present_horse && that_present_horse))
        return false;
      if (!this.horse.equals(that.horse))
        return false;
    }

    boolean this_present_monitor = true && this.isSetMonitor();
    boolean that_present_monitor = true && that.isSetMonitor();
    if (this_present_monitor || that_present_monitor) {
      if (!(this_present_monitor && that_present_monitor))
        return false;
      if (!this.monitor.equals(that.monitor))
        return false;
    }

    boolean this_present_intensity = true;
    boolean that_present_intensity = true;
    if (this_present_intensity || that_present_intensity) {
      if (!(this_present_intensity && that_present_intensity))
        return false;
      if (this.intensity != that.intensity)
        return false;
    }

    boolean this_present_time = true;
    boolean that_present_time = true;
    if (this_present_time || that_present_time) {
      if (!(this_present_time && that_present_time))
        return false;
      if (this.time != that.time)
        return false;
    }

    boolean this_present_nonce = true;
    boolean that_present_nonce = true;
    if (this_present_nonce || that_present_nonce) {
      if (!(this_present_nonce && that_present_nonce))
        return false;
      if (this.nonce != that.nonce)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ActivityEdge other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHorse()).compareTo(other.isSetHorse());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHorse()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.horse, other.horse);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMonitor()).compareTo(other.isSetMonitor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMonitor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.monitor, other.monitor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIntensity()).compareTo(other.isSetIntensity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIntensity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.intensity, other.intensity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTime()).compareTo(other.isSetTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.time, other.time);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNonce()).compareTo(other.isSetNonce());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNonce()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nonce, other.nonce);
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
    StringBuilder sb = new StringBuilder("ActivityEdge(");
    boolean first = true;

    sb.append("horse:");
    if (this.horse == null) {
      sb.append("null");
    } else {
      sb.append(this.horse);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("monitor:");
    if (this.monitor == null) {
      sb.append("null");
    } else {
      sb.append(this.monitor);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("intensity:");
    sb.append(this.intensity);
    first = false;
    if (!first) sb.append(", ");
    sb.append("time:");
    sb.append(this.time);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nonce:");
    sb.append(this.nonce);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (horse == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'horse' was not present! Struct: " + toString());
    }
    if (monitor == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'monitor' was not present! Struct: " + toString());
    }
    // alas, we cannot check 'intensity' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'time' because it's a primitive and you chose the non-beans generator.
    // alas, we cannot check 'nonce' because it's a primitive and you chose the non-beans generator.
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ActivityEdgeStandardSchemeFactory implements SchemeFactory {
    public ActivityEdgeStandardScheme getScheme() {
      return new ActivityEdgeStandardScheme();
    }
  }

  private static class ActivityEdgeStandardScheme extends StandardScheme<ActivityEdge> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ActivityEdge struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HORSE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.horse = new HorseID();
              struct.horse.read(iprot);
              struct.setHorseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MONITOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.monitor = new MonitorID();
              struct.monitor.read(iprot);
              struct.setMonitorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // INTENSITY
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.intensity = iprot.readI32();
              struct.setIntensityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.time = iprot.readI32();
              struct.setTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NONCE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.nonce = iprot.readI64();
              struct.setNonceIsSet(true);
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
      if (!struct.isSetIntensity()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'intensity' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetTime()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'time' was not found in serialized data! Struct: " + toString());
      }
      if (!struct.isSetNonce()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'nonce' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, ActivityEdge struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.horse != null) {
        oprot.writeFieldBegin(HORSE_FIELD_DESC);
        struct.horse.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.monitor != null) {
        oprot.writeFieldBegin(MONITOR_FIELD_DESC);
        struct.monitor.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(INTENSITY_FIELD_DESC);
      oprot.writeI32(struct.intensity);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(TIME_FIELD_DESC);
      oprot.writeI32(struct.time);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NONCE_FIELD_DESC);
      oprot.writeI64(struct.nonce);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ActivityEdgeTupleSchemeFactory implements SchemeFactory {
    public ActivityEdgeTupleScheme getScheme() {
      return new ActivityEdgeTupleScheme();
    }
  }

  private static class ActivityEdgeTupleScheme extends TupleScheme<ActivityEdge> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ActivityEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.horse.write(oprot);
      struct.monitor.write(oprot);
      oprot.writeI32(struct.intensity);
      oprot.writeI32(struct.time);
      oprot.writeI64(struct.nonce);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ActivityEdge struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.horse = new HorseID();
      struct.horse.read(iprot);
      struct.setHorseIsSet(true);
      struct.monitor = new MonitorID();
      struct.monitor.read(iprot);
      struct.setMonitorIsSet(true);
      struct.intensity = iprot.readI32();
      struct.setIntensityIsSet(true);
      struct.time = iprot.readI32();
      struct.setTimeIsSet(true);
      struct.nonce = iprot.readI64();
      struct.setNonceIsSet(true);
    }
  }

}

