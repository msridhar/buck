/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.artifact_cache.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-03-12")
public class BuckCacheStoreResponse implements org.apache.thrift.TBase<BuckCacheStoreResponse, BuckCacheStoreResponse._Fields>, java.io.Serializable, Cloneable, Comparable<BuckCacheStoreResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuckCacheStoreResponse");

  private static final org.apache.thrift.protocol.TField DEBUG_INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("debugInfo", org.apache.thrift.protocol.TType.STRUCT, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuckCacheStoreResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuckCacheStoreResponseTupleSchemeFactory());
  }

  public StoreDebugInfo debugInfo; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEBUG_INFO((short)1, "debugInfo");

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
        case 1: // DEBUG_INFO
          return DEBUG_INFO;
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
  private static final _Fields optionals[] = {_Fields.DEBUG_INFO};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEBUG_INFO, new org.apache.thrift.meta_data.FieldMetaData("debugInfo", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StoreDebugInfo.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuckCacheStoreResponse.class, metaDataMap);
  }

  public BuckCacheStoreResponse() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuckCacheStoreResponse(BuckCacheStoreResponse other) {
    if (other.isSetDebugInfo()) {
      this.debugInfo = new StoreDebugInfo(other.debugInfo);
    }
  }

  public BuckCacheStoreResponse deepCopy() {
    return new BuckCacheStoreResponse(this);
  }

  @Override
  public void clear() {
    this.debugInfo = null;
  }

  public StoreDebugInfo getDebugInfo() {
    return this.debugInfo;
  }

  public BuckCacheStoreResponse setDebugInfo(StoreDebugInfo debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  public void unsetDebugInfo() {
    this.debugInfo = null;
  }

  /** Returns true if field debugInfo is set (has been assigned a value) and false otherwise */
  public boolean isSetDebugInfo() {
    return this.debugInfo != null;
  }

  public void setDebugInfoIsSet(boolean value) {
    if (!value) {
      this.debugInfo = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DEBUG_INFO:
      if (value == null) {
        unsetDebugInfo();
      } else {
        setDebugInfo((StoreDebugInfo)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DEBUG_INFO:
      return getDebugInfo();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DEBUG_INFO:
      return isSetDebugInfo();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuckCacheStoreResponse)
      return this.equals((BuckCacheStoreResponse)that);
    return false;
  }

  public boolean equals(BuckCacheStoreResponse that) {
    if (that == null)
      return false;

    boolean this_present_debugInfo = true && this.isSetDebugInfo();
    boolean that_present_debugInfo = true && that.isSetDebugInfo();
    if (this_present_debugInfo || that_present_debugInfo) {
      if (!(this_present_debugInfo && that_present_debugInfo))
        return false;
      if (!this.debugInfo.equals(that.debugInfo))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_debugInfo = true && (isSetDebugInfo());
    list.add(present_debugInfo);
    if (present_debugInfo)
      list.add(debugInfo);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuckCacheStoreResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDebugInfo()).compareTo(other.isSetDebugInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebugInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debugInfo, other.debugInfo);
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
    StringBuilder sb = new StringBuilder("BuckCacheStoreResponse(");
    boolean first = true;

    if (isSetDebugInfo()) {
      sb.append("debugInfo:");
      if (this.debugInfo == null) {
        sb.append("null");
      } else {
        sb.append(this.debugInfo);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (debugInfo != null) {
      debugInfo.validate();
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

  private static class BuckCacheStoreResponseStandardSchemeFactory implements SchemeFactory {
    public BuckCacheStoreResponseStandardScheme getScheme() {
      return new BuckCacheStoreResponseStandardScheme();
    }
  }

  private static class BuckCacheStoreResponseStandardScheme extends StandardScheme<BuckCacheStoreResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuckCacheStoreResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEBUG_INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.debugInfo = new StoreDebugInfo();
              struct.debugInfo.read(iprot);
              struct.setDebugInfoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuckCacheStoreResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.debugInfo != null) {
        if (struct.isSetDebugInfo()) {
          oprot.writeFieldBegin(DEBUG_INFO_FIELD_DESC);
          struct.debugInfo.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuckCacheStoreResponseTupleSchemeFactory implements SchemeFactory {
    public BuckCacheStoreResponseTupleScheme getScheme() {
      return new BuckCacheStoreResponseTupleScheme();
    }
  }

  private static class BuckCacheStoreResponseTupleScheme extends TupleScheme<BuckCacheStoreResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuckCacheStoreResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDebugInfo()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetDebugInfo()) {
        struct.debugInfo.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuckCacheStoreResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.debugInfo = new StoreDebugInfo();
        struct.debugInfo.read(iprot);
        struct.setDebugInfoIsSet(true);
      }
    }
  }

}

