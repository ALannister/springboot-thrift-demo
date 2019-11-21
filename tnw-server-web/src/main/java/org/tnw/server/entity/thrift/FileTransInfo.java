/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.tnw.server.entity.thrift;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2019-11-20")
public class FileTransInfo implements org.apache.thrift.TBase<FileTransInfo, FileTransInfo._Fields>, java.io.Serializable, Cloneable, Comparable<FileTransInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FileTransInfo");

  private static final org.apache.thrift.protocol.TField TARGET_IP_FIELD_DESC = new org.apache.thrift.protocol.TField("targetIp", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField FILE_PATH_FIELD_DESC = new org.apache.thrift.protocol.TField("filePath", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new FileTransInfoStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new FileTransInfoTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable String targetIp; // required
  public @org.apache.thrift.annotation.Nullable String filePath; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TARGET_IP((short)1, "targetIp"),
    FILE_PATH((short)2, "filePath");

    private static final java.util.Map<String, _Fields> byName = new java.util.HashMap<String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TARGET_IP
          return TARGET_IP;
        case 2: // FILE_PATH
          return FILE_PATH;
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
    @org.apache.thrift.annotation.Nullable
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
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TARGET_IP, new org.apache.thrift.meta_data.FieldMetaData("targetIp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.FILE_PATH, new org.apache.thrift.meta_data.FieldMetaData("filePath", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FileTransInfo.class, metaDataMap);
  }

  public FileTransInfo() {
  }

  public FileTransInfo(
    String targetIp,
    String filePath)
  {
    this();
    this.targetIp = targetIp;
    this.filePath = filePath;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FileTransInfo(FileTransInfo other) {
    if (other.isSetTargetIp()) {
      this.targetIp = other.targetIp;
    }
    if (other.isSetFilePath()) {
      this.filePath = other.filePath;
    }
  }

  public FileTransInfo deepCopy() {
    return new FileTransInfo(this);
  }

  @Override
  public void clear() {
    this.targetIp = null;
    this.filePath = null;
  }

  @org.apache.thrift.annotation.Nullable
  public String getTargetIp() {
    return this.targetIp;
  }

  public FileTransInfo setTargetIp(@org.apache.thrift.annotation.Nullable String targetIp) {
    this.targetIp = targetIp;
    return this;
  }

  public void unsetTargetIp() {
    this.targetIp = null;
  }

  /** Returns true if field targetIp is set (has been assigned a value) and false otherwise */
  public boolean isSetTargetIp() {
    return this.targetIp != null;
  }

  public void setTargetIpIsSet(boolean value) {
    if (!value) {
      this.targetIp = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public String getFilePath() {
    return this.filePath;
  }

  public FileTransInfo setFilePath(@org.apache.thrift.annotation.Nullable String filePath) {
    this.filePath = filePath;
    return this;
  }

  public void unsetFilePath() {
    this.filePath = null;
  }

  /** Returns true if field filePath is set (has been assigned a value) and false otherwise */
  public boolean isSetFilePath() {
    return this.filePath != null;
  }

  public void setFilePathIsSet(boolean value) {
    if (!value) {
      this.filePath = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable Object value) {
    switch (field) {
    case TARGET_IP:
      if (value == null) {
        unsetTargetIp();
      } else {
        setTargetIp((String)value);
      }
      break;

    case FILE_PATH:
      if (value == null) {
        unsetFilePath();
      } else {
        setFilePath((String)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TARGET_IP:
      return getTargetIp();

    case FILE_PATH:
      return getFilePath();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TARGET_IP:
      return isSetTargetIp();
    case FILE_PATH:
      return isSetFilePath();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FileTransInfo)
      return this.equals((FileTransInfo)that);
    return false;
  }

  public boolean equals(FileTransInfo that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_targetIp = true && this.isSetTargetIp();
    boolean that_present_targetIp = true && that.isSetTargetIp();
    if (this_present_targetIp || that_present_targetIp) {
      if (!(this_present_targetIp && that_present_targetIp))
        return false;
      if (!this.targetIp.equals(that.targetIp))
        return false;
    }

    boolean this_present_filePath = true && this.isSetFilePath();
    boolean that_present_filePath = true && that.isSetFilePath();
    if (this_present_filePath || that_present_filePath) {
      if (!(this_present_filePath && that_present_filePath))
        return false;
      if (!this.filePath.equals(that.filePath))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetTargetIp()) ? 131071 : 524287);
    if (isSetTargetIp())
      hashCode = hashCode * 8191 + targetIp.hashCode();

    hashCode = hashCode * 8191 + ((isSetFilePath()) ? 131071 : 524287);
    if (isSetFilePath())
      hashCode = hashCode * 8191 + filePath.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(FileTransInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTargetIp()).compareTo(other.isSetTargetIp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTargetIp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.targetIp, other.targetIp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFilePath()).compareTo(other.isSetFilePath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFilePath()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.filePath, other.filePath);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("FileTransInfo(");
    boolean first = true;

    sb.append("targetIp:");
    if (this.targetIp == null) {
      sb.append("null");
    } else {
      sb.append(this.targetIp);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("filePath:");
    if (this.filePath == null) {
      sb.append("null");
    } else {
      sb.append(this.filePath);
    }
    first = false;
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

  private static class FileTransInfoStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileTransInfoStandardScheme getScheme() {
      return new FileTransInfoStandardScheme();
    }
  }

  private static class FileTransInfoStandardScheme extends org.apache.thrift.scheme.StandardScheme<FileTransInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FileTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TARGET_IP
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.targetIp = iprot.readString();
              struct.setTargetIpIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FILE_PATH
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.filePath = iprot.readString();
              struct.setFilePathIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FileTransInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.targetIp != null) {
        oprot.writeFieldBegin(TARGET_IP_FIELD_DESC);
        oprot.writeString(struct.targetIp);
        oprot.writeFieldEnd();
      }
      if (struct.filePath != null) {
        oprot.writeFieldBegin(FILE_PATH_FIELD_DESC);
        oprot.writeString(struct.filePath);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FileTransInfoTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public FileTransInfoTupleScheme getScheme() {
      return new FileTransInfoTupleScheme();
    }
  }

  private static class FileTransInfoTupleScheme extends org.apache.thrift.scheme.TupleScheme<FileTransInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FileTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetTargetIp()) {
        optionals.set(0);
      }
      if (struct.isSetFilePath()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetTargetIp()) {
        oprot.writeString(struct.targetIp);
      }
      if (struct.isSetFilePath()) {
        oprot.writeString(struct.filePath);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FileTransInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.targetIp = iprot.readString();
        struct.setTargetIpIsSet(true);
      }
      if (incoming.get(1)) {
        struct.filePath = iprot.readString();
        struct.setFilePathIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

