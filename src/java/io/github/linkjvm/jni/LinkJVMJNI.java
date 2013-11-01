/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.linkjvm.jni;

public class LinkJVMJNI {
  public final static native void delete_IntSensor(long jarg1);
  public final static native int IntSensor_value(long jarg1, IntSensor jarg1_);
  public final static native void delete_UnsingnedShortSensor(long jarg1);
  public final static native int UnsingnedShortSensor_value(long jarg1, UnsingnedShortSensor jarg1_);
  public final static native void delete_ShortSensor(long jarg1);
  public final static native short ShortSensor_value(long jarg1, ShortSensor jarg1_);
  public final static native void delete_BoolSensor(long jarg1);
  public final static native boolean BoolSensor_value(long jarg1, BoolSensor jarg1_);
  public final static native void delete_UnsignedCharSensor(long jarg1);
  public final static native short UnsignedCharSensor_value(long jarg1, UnsignedCharSensor jarg1_);
  public final static native void delete_CharSensor(long jarg1);
  public final static native char CharSensor_value(long jarg1, CharSensor jarg1_);
  public final static native long new_Motor(long jarg1);
  public final static native void Motor_clearPositionCounter(long jarg1, Motor jarg1_);
  public final static native void Motor_moveAtVelocity(long jarg1, Motor jarg1_, short jarg2);
  public final static native void Motor_moveToPosition(long jarg1, Motor jarg1_, short jarg2, int jarg3);
  public final static native void Motor_moveRelativePosition(long jarg1, Motor jarg1_, short jarg2, int jarg3);
  public final static native void Motor_setPidGains(long jarg1, Motor jarg1_, short jarg2, short jarg3, short jarg4, short jarg5, short jarg6, short jarg7);
  public final static native void Motor_pidGains(long jarg1, Motor jarg1_, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native void Motor_freeze(long jarg1, Motor jarg1_);
  public final static native boolean Motor_isMotorDone(long jarg1, Motor jarg1_);
  public final static native void Motor_blockMotorDone(long jarg1, Motor jarg1_);
  public final static native void Motor_forward(long jarg1, Motor jarg1_);
  public final static native void Motor_backward(long jarg1, Motor jarg1_);
  public final static native void Motor_motor(long jarg1, Motor jarg1_, int jarg2);
  public final static native void Motor_off(long jarg1, Motor jarg1_);
  public final static native long Motor_port(long jarg1, Motor jarg1_);
  public final static native void delete_Motor(long jarg1);
  public final static native long new_BackEMF(short jarg1);
  public final static native int BackEMF_value(long jarg1, BackEMF jarg1_);
  public final static native short BackEMF_port(long jarg1, BackEMF jarg1_);
  public final static native void delete_BackEMF(long jarg1);
  public final static native long new_Servo(long jarg1);
  public final static native void Servo_setPosition(long jarg1, Servo jarg1_, long jarg2);
  public final static native long Servo_position(long jarg1, Servo jarg1_);
  public final static native void Servo_disable(long jarg1, Servo jarg1_);
  public final static native void Servo_enable(long jarg1, Servo jarg1_);
  public final static native void Servo_setEnabled(long jarg1, Servo jarg1_, boolean jarg2);
  public final static native boolean Servo_isEnabled(long jarg1, Servo jarg1_);
  public final static native void delete_Servo(long jarg1);
  public final static native long new_Analog(short jarg1);
  public final static native int Analog_value(long jarg1, Analog jarg1_);
  public final static native void Analog_setPullup(long jarg1, Analog jarg1_, boolean jarg2);
  public final static native boolean Analog_pullup(long jarg1, Analog jarg1_);
  public final static native short Analog_port(long jarg1, Analog jarg1_);
  public final static native void delete_Analog(long jarg1);
  public final static native long new_Analog8(short jarg1);
  public final static native int Analog8_value(long jarg1, Analog8 jarg1_);
  public final static native void delete_Analog8(long jarg1);
  public final static native long new_Digital(short jarg1);
  public final static native void Digital_setValue(long jarg1, Digital jarg1_, boolean jarg2);
  public final static native boolean Digital_value(long jarg1, Digital jarg1_);
  public final static native void Digital_setOutput(long jarg1, Digital jarg1_, boolean jarg2);
  public final static native boolean Digital_isOutput(long jarg1, Digital jarg1_);
  public final static native void Digital_setPullup(long jarg1, Digital jarg1_, boolean jarg2);
  public final static native boolean Digital_pullup(long jarg1, Digital jarg1_);
  public final static native void delete_Digital(long jarg1);
  public final static native void delete_AbstractButton(long jarg1);
  public final static native void AbstractButton_setPressed(long jarg1, AbstractButton jarg1_, boolean jarg2);
  public final static native boolean AbstractButton_isPressed(long jarg1, AbstractButton jarg1_);
  public final static native boolean AbstractButton_isNotPressed(long jarg1, AbstractButton jarg1_);
  public final static native boolean AbstractButton_isClicked(long jarg1, AbstractButton jarg1_);
  public final static native void AbstractButton_waitUntilReleased(long jarg1, AbstractButton jarg1_);
  public final static native void AbstractButton_waitUntilPressed(long jarg1, AbstractButton jarg1_);
  public final static native void AbstractButton_waitUntilClicked(long jarg1, AbstractButton jarg1_);
  public final static native void delete_AbstractTextButton(long jarg1);
  public final static native void AbstractTextButton_setText(long jarg1, AbstractTextButton jarg1_, String jarg2);
  public final static native String AbstractTextButton_text(long jarg1, AbstractTextButton jarg1_);
  public final static native boolean AbstractTextButton_isTextDirty(long jarg1, AbstractTextButton jarg1_);
  public final static native void AbstractTextButton_resetText(long jarg1, AbstractTextButton jarg1_);
  public final static native long new_IdButton(int jarg1, String jarg2);
  public final static native void delete_IdButton(long jarg1);
  public final static native void IdButton_setText(long jarg1, IdButton jarg1_, String jarg2);
  public final static native String IdButton_text(long jarg1, IdButton jarg1_);
  public final static native boolean IdButton_isTextDirty(long jarg1, IdButton jarg1_);
  public final static native void IdButton_setPressed(long jarg1, IdButton jarg1_, boolean jarg2);
  public final static native boolean IdButton_value(long jarg1, IdButton jarg1_);
  public final static native void IdButton_resetText(long jarg1, IdButton jarg1_);
  public final static native void ExtraButtons_show();
  public final static native void ExtraButtons_hide();
  public final static native void ExtraButtons_setShown(boolean jarg1);
  public final static native boolean ExtraButtons_isShown();
  public final static native long new_ExtraButtons();
  public final static native void delete_ExtraButtons(long jarg1);
  public final static native void A_set(long jarg1, IdButton jarg1_);
  public final static native long A_get();
  public final static native void B_set(long jarg1, IdButton jarg1_);
  public final static native long B_get();
  public final static native void C_set(long jarg1, IdButton jarg1_);
  public final static native long C_get();
  public final static native void X_set(long jarg1, IdButton jarg1_);
  public final static native long X_get();
  public final static native void Y_set(long jarg1, IdButton jarg1_);
  public final static native long Y_get();
  public final static native void Z_set(long jarg1, IdButton jarg1_);
  public final static native long Z_get();
  public final static native void Side_set(long jarg1, IdButton jarg1_);
  public final static native long Side_get();
  public final static native long all_get();
  public final static native long new_unsignedIntPoint2(long jarg1, long jarg2);
  public final static native long unsignedIntPoint2_x(long jarg1, unsignedIntPoint2 jarg1_);
  public final static native long unsignedIntPoint2_y(long jarg1, unsignedIntPoint2 jarg1_);
  public final static native void unsignedIntPoint2_setX(long jarg1, unsignedIntPoint2 jarg1_, long jarg2);
  public final static native void unsignedIntPoint2_setY(long jarg1, unsignedIntPoint2 jarg1_, long jarg2);
  public final static native long unsignedIntPoint2_toCPoint2(long jarg1, unsignedIntPoint2 jarg1_);
  public final static native void delete_unsignedIntPoint2(long jarg1);
  public final static native long new_unsignedIntRect2(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native long unsignedIntRect2_x(long jarg1, unsignedIntRect2 jarg1_);
  public final static native long unsignedIntRect2_y(long jarg1, unsignedIntRect2 jarg1_);
  public final static native long unsignedIntRect2_width(long jarg1, unsignedIntRect2 jarg1_);
  public final static native long unsignedIntRect2_height(long jarg1, unsignedIntRect2 jarg1_);
  public final static native long unsignedIntRect2_center(long jarg1, unsignedIntRect2 jarg1_);
  public final static native void unsignedIntRect2_setX(long jarg1, unsignedIntRect2 jarg1_, long jarg2);
  public final static native void unsignedIntRect2_setY(long jarg1, unsignedIntRect2 jarg1_, long jarg2);
  public final static native void unsignedIntRect2_setWidth(long jarg1, unsignedIntRect2 jarg1_, long jarg2);
  public final static native void unsignedIntRect2_setHeight(long jarg1, unsignedIntRect2 jarg1_, long jarg2);
  public final static native long unsignedIntRect2_area(long jarg1, unsignedIntRect2 jarg1_);
  public final static native long unsignedIntRect2_toCRectangle(long jarg1, unsignedIntRect2 jarg1_);
  public final static native void delete_unsignedIntRect2(long jarg1);
  public final static native long new_Config__SWIG_0();
  public final static native long new_Config__SWIG_1(long jarg1);
  public final static native long Config_load(String jarg1);
  public final static native boolean Config_save(long jarg1, Config jarg1_, String jarg2);
  public final static native void Config_beginGroup(long jarg1, Config jarg1_, String jarg2);
  public final static native void Config_endGroup(long jarg1, Config jarg1_);
  public final static native void Config_clearGroup(long jarg1, Config jarg1_);
  public final static native void Config_clear(long jarg1, Config jarg1_);
  public final static native boolean Config_containsKey(long jarg1, Config jarg1_, String jarg2);
  public final static native boolean Config_boolValue(long jarg1, Config jarg1_, String jarg2);
  public final static native int Config_intValue(long jarg1, Config jarg1_, String jarg2);
  public final static native double Config_doubleValue(long jarg1, Config jarg1_, String jarg2);
  public final static native String Config_stringValue(long jarg1, Config jarg1_, String jarg2);
  public final static native void Config_setValue__SWIG_0(long jarg1, Config jarg1_, String jarg2, boolean jarg3);
  public final static native void Config_setValue__SWIG_1(long jarg1, Config jarg1_, String jarg2, int jarg3);
  public final static native void Config_setValue__SWIG_2(long jarg1, Config jarg1_, String jarg2, double jarg3);
  public final static native void Config_setValue__SWIG_3(long jarg1, Config jarg1_, String jarg2, String jarg3);
  public final static native long Config_values(long jarg1, Config jarg1_);
  public final static native void Config_addValues(long jarg1, Config jarg1_, long jarg2, Config jarg2_);
  public final static native void delete_Config(long jarg1);
  public final static native String CAMERA_GROUP_get();
  public final static native String CAMERA_NUM_CHANNELS_KEY_get();
  public final static native String CAMERA_CHANNEL_GROUP_PREFIX_get();
  public final static native String CAMERA_CHANNEL_TYPE_KEY_get();
  public final static native String CAMERA_CHANNEL_TYPE_HSV_KEY_get();
  public final static native String CAMERA_CHANNEL_TYPE_QR_KEY_get();
  public final static native long new_Object__SWIG_0(long jarg1, unsignedIntPoint2 jarg1_, long jarg2, unsignedIntRect2 jarg2_, double jarg3, String jarg4, long jarg5);
  public final static native long new_Object__SWIG_1(long jarg1, unsignedIntPoint2 jarg1_, long jarg2, unsignedIntRect2 jarg2_, double jarg3, String jarg4);
  public final static native long new_Object__SWIG_2(long jarg1, unsignedIntPoint2 jarg1_, long jarg2, unsignedIntRect2 jarg2_, double jarg3);
  public final static native long new_Object__SWIG_3(long jarg1, Object jarg1_);
  public final static native void delete_Object(long jarg1);
  public final static native long Object_centroid(long jarg1, Object jarg1_);
  public final static native long Object_boundingBox(long jarg1, Object jarg1_);
  public final static native double Object_confidence(long jarg1, Object jarg1_);
  public final static native String Object_data(long jarg1, Object jarg1_);
  public final static native long Object_dataLength(long jarg1, Object jarg1_);
  public final static native void delete_ChannelImpl(long jarg1);
  public final static native void ChannelImpl_setImage(long jarg1, ChannelImpl jarg1_, long jarg2);
  public final static native long ChannelImpl_objects(long jarg1, ChannelImpl jarg1_, long jarg2, Config jarg2_);
  public final static native void delete_ChannelImplManager(long jarg1);
  public final static native void ChannelImplManager_setImage(long jarg1, ChannelImplManager jarg1_, long jarg2);
  public final static native long ChannelImplManager_channelImpl(long jarg1, ChannelImplManager jarg1_, String jarg2);
  public final static native long new_DefaultChannelImplManager();
  public final static native void delete_DefaultChannelImplManager(long jarg1);
  public final static native void DefaultChannelImplManager_setImage(long jarg1, DefaultChannelImplManager jarg1_, long jarg2);
  public final static native long DefaultChannelImplManager_channelImpl(long jarg1, DefaultChannelImplManager jarg1_, String jarg2);
  public final static native long new_Channel(long jarg1, Device jarg1_, long jarg2, Config jarg2_);
  public final static native void delete_Channel(long jarg1);
  public final static native void Channel_invalidate(long jarg1, Channel jarg1_);
  public final static native long Channel_objects(long jarg1, Channel jarg1_);
  public final static native long Channel_device(long jarg1, Channel jarg1_);
  public final static native void Channel_setConfig(long jarg1, Channel jarg1_, long jarg2, Config jarg2_);
  public final static native String ConfigPath_extension();
  public final static native void ConfigPath_setBasePath(String jarg1);
  public final static native String ConfigPath_path__SWIG_0(String jarg1);
  public final static native String ConfigPath_path__SWIG_1();
  public final static native String ConfigPath_defaultPath();
  public final static native String ConfigPath_defaultConfigPath();
  public final static native void ConfigPath_setDefaultConfigPath(String jarg1);
  public final static native long new_ConfigPath();
  public final static native void delete_ConfigPath(long jarg1);
  public final static native void delete_InputProvider(long jarg1);
  public final static native boolean InputProvider_open(long jarg1, InputProvider jarg1_, int jarg2);
  public final static native boolean InputProvider_isOpen(long jarg1, InputProvider jarg1_);
  public final static native void InputProvider_setWidth(long jarg1, InputProvider jarg1_, long jarg2);
  public final static native void InputProvider_setHeight(long jarg1, InputProvider jarg1_, long jarg2);
  public final static native boolean InputProvider_next(long jarg1, InputProvider jarg1_, long jarg2);
  public final static native boolean InputProvider_close(long jarg1, InputProvider jarg1_);
  public final static native long new_UsbInputProvider();
  public final static native void delete_UsbInputProvider(long jarg1);
  public final static native boolean UsbInputProvider_open(long jarg1, UsbInputProvider jarg1_, int jarg2);
  public final static native boolean UsbInputProvider_isOpen(long jarg1, UsbInputProvider jarg1_);
  public final static native void UsbInputProvider_setWidth(long jarg1, UsbInputProvider jarg1_, long jarg2);
  public final static native void UsbInputProvider_setHeight(long jarg1, UsbInputProvider jarg1_, long jarg2);
  public final static native boolean UsbInputProvider_next(long jarg1, UsbInputProvider jarg1_, long jarg2);
  public final static native boolean UsbInputProvider_close(long jarg1, UsbInputProvider jarg1_);
  public final static native long new_Device(long jarg1, InputProvider jarg1_);
  public final static native void delete_Device(long jarg1);
  public final static native boolean Device_open__SWIG_0(long jarg1, Device jarg1_, int jarg2);
  public final static native boolean Device_open__SWIG_1(long jarg1, Device jarg1_);
  public final static native boolean Device_isOpen(long jarg1, Device jarg1_);
  public final static native boolean Device_close(long jarg1, Device jarg1_);
  public final static native boolean Device_update(long jarg1, Device jarg1_);
  public final static native void Device_setWidth(long jarg1, Device jarg1_, long jarg2);
  public final static native void Device_setHeight(long jarg1, Device jarg1_, long jarg2);
  public final static native long Device_width(long jarg1, Device jarg1_);
  public final static native long Device_height(long jarg1, Device jarg1_);
  public final static native long Device_channels(long jarg1, Device jarg1_);
  public final static native long Device_inputProvider(long jarg1, Device jarg1_);
  public final static native long Device_rawImage(long jarg1, Device jarg1_);
  public final static native void Device_setConfig(long jarg1, Device jarg1_, long jarg2, Config jarg2_);
  public final static native long Device_config(long jarg1, Device jarg1_);
  public final static native void Device_setChannelImplManager(long jarg1, Device jarg1_, long jarg2, ChannelImplManager jarg2_);
  public final static native long Device_channelImplManager(long jarg1, Device jarg1_);
  public final static native long Device_bgr(long jarg1, Device jarg1_);
  public final static native long cDevice();
  public final static native void Ir_read();
  public final static native void Ir_write();
  public final static native long new_Ir();
  public final static native void delete_Ir(long jarg1);
  public final static native boolean Battery_isCharging();
  public final static native float Battery_powerLevel();
  public final static native long new_Battery();
  public final static native void delete_Battery(long jarg1);
  public final static native double PI_get();
  public final static native long new_CreateScript__SWIG_0();
  public final static native long new_CreateScript__SWIG_1(long jarg1, CreateScript jarg1_);
  public final static native void CreateScript_append__SWIG_0(long jarg1, CreateScript jarg1_, short jarg2);
  public final static native void CreateScript_append__SWIG_1(long jarg1, CreateScript jarg1_, long jarg2, long jarg3);
  public final static native void CreateScript_append__SWIG_2(long jarg1, CreateScript jarg1_, long jarg2, CreateScript jarg2_);
  public final static native void CreateScript_remove__SWIG_0(long jarg1, CreateScript jarg1_, long jarg2, long jarg3);
  public final static native void CreateScript_remove__SWIG_1(long jarg1, CreateScript jarg1_, long jarg2);
  public final static native long CreateScript_data(long jarg1, CreateScript jarg1_);
  public final static native long CreateScript_size(long jarg1, CreateScript jarg1_);
  public final static native short CreateScript__byte(long jarg1, CreateScript jarg1_, long jarg2);
  public final static native void delete_CreateScript(long jarg1);
  public final static native void CreateState_timestamp_set(long jarg1, CreateState jarg1_, long jarg2);
  public final static native long CreateState_timestamp_get(long jarg1, CreateState jarg1_);
  public final static native void CreateState_distance_set(long jarg1, CreateState jarg1_, int jarg2);
  public final static native int CreateState_distance_get(long jarg1, CreateState jarg1_);
  public final static native void CreateState_angle_set(long jarg1, CreateState jarg1_, int jarg2);
  public final static native int CreateState_angle_get(long jarg1, CreateState jarg1_);
  public final static native void CreateState_radius_set(long jarg1, CreateState jarg1_, short jarg2);
  public final static native short CreateState_radius_get(long jarg1, CreateState jarg1_);
  public final static native void CreateState_rightVelocity_set(long jarg1, CreateState jarg1_, short jarg2);
  public final static native short CreateState_rightVelocity_get(long jarg1, CreateState jarg1_);
  public final static native void CreateState_leftVelocity_set(long jarg1, CreateState jarg1_, short jarg2);
  public final static native short CreateState_leftVelocity_get(long jarg1, CreateState jarg1_);
  public final static native long new_CreateState();
  public final static native void delete_CreateState(long jarg1);
  public final static native void delete_Create(long jarg1);
  public final static native boolean Create_connect(long jarg1, Create jarg1_);
  public final static native boolean Create_disconnect(long jarg1, Create jarg1_);
  public final static native boolean Create_isConnected(long jarg1, Create jarg1_);
  public final static native void Create_setPassiveMode(long jarg1, Create jarg1_);
  public final static native void Create_setSafeMode(long jarg1, Create jarg1_);
  public final static native void Create_setFullMode(long jarg1, Create jarg1_);
  public final static native void Create_setMode(long jarg1, Create jarg1_, int jarg2);
  public final static native int Create_mode(long jarg1, Create jarg1_);
  public final static native void Create_send(long jarg1, Create jarg1_, long jarg2, CreateScript jarg2_);
  public final static native boolean Create_write__SWIG_0(long jarg1, Create jarg1_, short jarg2);
  public final static native boolean Create_write__SWIG_1(long jarg1, Create jarg1_, long jarg2, long jarg3);
  public final static native void Create_flush(long jarg1, Create jarg1_);
  public final static native short Create_read__SWIG_0(long jarg1, Create jarg1_);
  public final static native int Create_read__SWIG_1(long jarg1, Create jarg1_, long jarg2, long jarg3);
  public final static native boolean Create_blockingRead__SWIG_0(long jarg1, Create jarg1_, long jarg2, long jarg3, long jarg4);
  public final static native boolean Create_blockingRead__SWIG_1(long jarg1, Create jarg1_, long jarg2, long jarg3);
  public final static native void Create_setLeds(long jarg1, Create jarg1_, boolean jarg2, boolean jarg3, short jarg4, short jarg5);
  public final static native void Create_drive(long jarg1, Create jarg1_, short jarg2, short jarg3);
  public final static native void Create_driveDirect(long jarg1, Create jarg1_, short jarg2, short jarg3);
  public final static native void Create_driveStraight(long jarg1, Create jarg1_, short jarg2);
  public final static native void Create_stop(long jarg1, Create jarg1_);
  public final static native void Create_turn(long jarg1, Create jarg1_, short jarg2, int jarg3);
  public final static native void Create_move(long jarg1, Create jarg1_, short jarg2, int jarg3);
  public final static native void Create_spin(long jarg1, Create jarg1_, short jarg2);
  public final static native short Create_angularVelocity(long jarg1, Create jarg1_);
  public final static native void Create_spinClockwise(long jarg1, Create jarg1_, short jarg2);
  public final static native void Create_spinCounterClockwise(long jarg1, Create jarg1_, short jarg2);
  public final static native boolean Create_setBaudRate(long jarg1, Create jarg1_, short jarg2);
  public final static native void Create_setDistance(long jarg1, Create jarg1_, int jarg2);
  public final static native void Create_setAngle(long jarg1, Create jarg1_, int jarg2);
  public final static native long Create_playButton(long jarg1, Create jarg1_);
  public final static native long Create_advanceButton(long jarg1, Create jarg1_);
  public final static native long Create_wall(long jarg1, Create jarg1_);
  public final static native long Create_cliffLeft(long jarg1, Create jarg1_);
  public final static native long Create_cliffFrontLeft(long jarg1, Create jarg1_);
  public final static native long Create_cliffFrontRight(long jarg1, Create jarg1_);
  public final static native long Create_cliffRight(long jarg1, Create jarg1_);
  public final static native long Create_virtualWall(long jarg1, Create jarg1_);
  public final static native long Create_wallSignal(long jarg1, Create jarg1_);
  public final static native long Create_cliffLeftSignal(long jarg1, Create jarg1_);
  public final static native long Create_cliffFrontLeftSignal(long jarg1, Create jarg1_);
  public final static native long Create_cliffFrontRightSignal(long jarg1, Create jarg1_);
  public final static native long Create_cliffRightSignal(long jarg1, Create jarg1_);
  public final static native long Create_cargoBayAnalogSignal(long jarg1, Create jarg1_);
  public final static native long Create_cargoBayDigitalInputs(long jarg1, Create jarg1_);
  public final static native long Create_ir(long jarg1, Create jarg1_);
  public final static native long Create_chargingState(long jarg1, Create jarg1_);
  public final static native long Create_batteryTemperature(long jarg1, Create jarg1_);
  public final static native long Create_batteryCharge(long jarg1, Create jarg1_);
  public final static native long Create_batteryCapacity(long jarg1, Create jarg1_);
  public final static native long Create_angle(long jarg1, Create jarg1_);
  public final static native long Create_distance(long jarg1, Create jarg1_);
  public final static native long Create_bumpLeft(long jarg1, Create jarg1_);
  public final static native long Create_bumpRight(long jarg1, Create jarg1_);
  public final static native long Create_wheelDropLeft(long jarg1, Create jarg1_);
  public final static native long Create_wheelDropRight(long jarg1, Create jarg1_);
  public final static native long Create_wheelDropCaster(long jarg1, Create jarg1_);
  public final static native void Create_setRefreshRate(long jarg1, Create jarg1_, int jarg2);
  public final static native int Create_refreshRate(long jarg1, Create jarg1_);
  public final static native long Create_instance();
  public final static native long Create_state(long jarg1, Create jarg1_);
  public final static native void Console_clear();
  public final static native long new_Console();
  public final static native void delete_Console(long jarg1);
  public final static native void Category_append__SWIG_0(long jarg1, Category jarg1_, String jarg2);
  public final static native void Category_append__SWIG_1(long jarg1, Category jarg1_, double jarg2);
  public final static native void Category_remove(long jarg1, Category jarg1_, long jarg2);
  public final static native long Category_entries(long jarg1, Category jarg1_);
  public final static native String Category_name(long jarg1, Category jarg1_);
  public final static native void delete_Category(long jarg1);
  public final static native void delete_DataLogWriter(long jarg1);
  public final static native boolean DataLogWriter_write(long jarg1, DataLogWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native long new_CsvWriter(String jarg1);
  public final static native boolean CsvWriter_write(long jarg1, CsvWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native void delete_CsvWriter(long jarg1);
  public final static native long new_PlainWriter(String jarg1);
  public final static native boolean PlainWriter_write(long jarg1, PlainWriter jarg1_, long jarg2, DataLog jarg2_);
  public final static native void delete_PlainWriter(long jarg1);
  public final static native void delete_DataLog(long jarg1);
  public final static native long DataLog_category(long jarg1, DataLog jarg1_, String jarg2);
  public final static native void DataLog_removeCategory(long jarg1, DataLog jarg1_, String jarg2);
  public final static native long DataLog_categories(long jarg1, DataLog jarg1_);
  public final static native boolean DataLog_write(long jarg1, DataLog jarg1_, long jarg2, DataLogWriter jarg2_);
  public final static native void DataLog_clear(long jarg1, DataLog jarg1_);
  public final static native long new_DataLog();
  public final static native short Acceleration_x();
  public final static native short Acceleration_y();
  public final static native short Acceleration_z();
  public final static native boolean Acceleration_calibrate();
  public final static native long new_Acceleration();
  public final static native void delete_Acceleration(long jarg1);
  public final static native short AccelX_value(long jarg1, AccelX jarg1_);
  public final static native long new_AccelX();
  public final static native void delete_AccelX(long jarg1);
  public final static native short AccelY_value(long jarg1, AccelY jarg1_);
  public final static native long new_AccelY();
  public final static native void delete_AccelY(long jarg1);
  public final static native short AccelZ_value(long jarg1, AccelZ jarg1_);
  public final static native long new_AccelZ();
  public final static native void delete_AccelZ(long jarg1);
  public final static native long BackEMF_SWIGUpcast(long jarg1);
  public final static native long Analog_SWIGUpcast(long jarg1);
  public final static native long Analog8_SWIGUpcast(long jarg1);
  public final static native long Digital_SWIGUpcast(long jarg1);
  public final static native long AbstractButton_SWIGUpcast(long jarg1);
  public final static native long AbstractTextButton_SWIGUpcast(long jarg1);
  public final static native long IdButton_SWIGUpcast(long jarg1);
  public final static native long DefaultChannelImplManager_SWIGUpcast(long jarg1);
  public final static native long UsbInputProvider_SWIGUpcast(long jarg1);
  public final static native long CsvWriter_SWIGUpcast(long jarg1);
  public final static native long PlainWriter_SWIGUpcast(long jarg1);
  public final static native long AccelX_SWIGUpcast(long jarg1);
  public final static native long AccelY_SWIGUpcast(long jarg1);
  public final static native long AccelZ_SWIGUpcast(long jarg1);
}
