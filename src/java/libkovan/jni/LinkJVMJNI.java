/*
* This file is part of LinkJVM.
*
* Java Framework for the KIPR Link
* Copyright (C) 2013 Markus Klein<m@mklein.co.at>
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program. If not, see <http://www.gnu.org/licenses/>.
*/

/*
 * IMPORTANT!!!
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 */

package libkovan.jni;

/**
 * Contains the native libkovan method definitions and loads the native libkovan wrapper.
 * <strong>Should not be used!!!</strong>
 * 
 * @author Markus Klein
 * @version 1.0.0
 *
 */

public class LinkJVMJNI {
  static{
    System.load("/usr/local/LinkJVM/lib/LinkJVM.so");
  }
  public final static native void wait_for_light(int jarg1);
  public final static native void shut_down_in(double jarg1);
  public final static native void beep__SWIG_0();
  public final static native int get_motor_position_counter(int jarg1);
  public final static native void clear_motor_position_counter(int jarg1);
  public final static native int move_at_velocity(int jarg1, int jarg2);
  public final static native int mav(int jarg1, int jarg2);
  public final static native int move_to_position(int jarg1, int jarg2, int jarg3);
  public final static native int mtp(int jarg1, int jarg2, int jarg3);
  public final static native int move_relative_position(int jarg1, int jarg2, int jarg3);
  public final static native int mrp(int jarg1, int jarg2, int jarg3);
  public final static native void set_pid_gains(int jarg1, short jarg2, short jarg3, short jarg4, short jarg5, short jarg6, short jarg7);
  public final static native void get_pid_gains(int jarg1, long jarg2, long jarg3, long jarg4, long jarg5, long jarg6, long jarg7);
  public final static native int freeze(int jarg1);
  public final static native int get_motor_done(int jarg1);
  public final static native void block_motor_done(int jarg1);
  public final static native void bmd(int jarg1);
  public final static native int setpwm(int jarg1, int jarg2);
  public final static native int getpwm(int jarg1);
  public final static native void fd(int jarg1);
  public final static native void bk(int jarg1);
  public final static native void motor(int jarg1, int jarg2);
  public final static native void off(int jarg1);
  public final static native void alloff();
  public final static native void ao();
  public final static native int create_connect();
  public final static native void create_disconnect();
  public final static native void create_start();
  public final static native void create_passive();
  public final static native void create_safe();
  public final static native void create_full();
  public final static native void create_spot();
  public final static native void create_cover();
  public final static native void create_demo(int jarg1);
  public final static native void create_cover_dock();
  public final static native int get_create_mode();
  public final static native int get_create_lbump();
  public final static native int get_create_rbump();
  public final static native int get_create_lwdrop();
  public final static native int get_create_cwdrop();
  public final static native int get_create_rwdrop();
  public final static native int get_create_wall();
  public final static native int get_create_lcliff();
  public final static native int get_create_lfcliff();
  public final static native int get_create_rfcliff();
  public final static native int get_create_rcliff();
  public final static native int get_create_vwall();
  public final static native int get_create_overcurrents();
  public final static native int get_create_infrared();
  public final static native int get_create_advance_button();
  public final static native int get_create_play_button();
  public final static native int get_create_normalized_angle();
  public final static native void set_create_normalized_angle(int jarg1);
  public final static native int get_create_total_angle();
  public final static native void set_create_total_angle(int jarg1);
  public final static native int get_create_distance();
  public final static native void set_create_distance(int jarg1);
  public final static native int get_create_battery_charging_state();
  public final static native int get_create_battery_voltage();
  public final static native int get_create_battery_current();
  public final static native int get_create_battery_temp();
  public final static native int get_create_battery_charge();
  public final static native int get_create_battery_capacity();
  public final static native int get_create_wall_amt();
  public final static native int get_create_lcliff_amt();
  public final static native int get_create_lfcliff_amt();
  public final static native int get_create_rfcliff_amt();
  public final static native int get_create_rcliff_amt();
  public final static native int get_create_bay_DI();
  public final static native int get_create_bay_AI();
  public final static native int get_create_song_number();
  public final static native int get_create_song_playing();
  public final static native int get_create_number_of_stream_packets();
  public final static native int get_create_requested_velocity();
  public final static native int get_create_requested_radius();
  public final static native int get_create_requested__right_velocity();
  public final static native int get_create_requested_left_velocity();
  public final static native void create_stop();
  public final static native void create_drive(int jarg1, int jarg2);
  public final static native void create_drive_straight(int jarg1);
  public final static native void create_spin_CW(int jarg1);
  public final static native void create_spin_CCW(int jarg1);
  public final static native void create_drive_direct(int jarg1, int jarg2);
  public final static native void create_advance_led(int jarg1);
  public final static native void create_play_led(int jarg1);
  public final static native void create_power_led(int jarg1, int jarg2);
  public final static native void create_load_song(int jarg1);
  public final static native void create_play_song(int jarg1);
  public final static native void set_digital_output(int jarg1, int jarg2);
  public final static native void set_digital_value(int jarg1, int jarg2);
  public final static native void display_clear();
  public final static native int a_button();
  public final static native int analog(int jarg1);
  public final static native int analog10(int jarg1);
  public final static native int b_button();
  public final static native int side_button();
  public final static native int digital(int jarg1);
  public final static native double power_level();
  public final static native void set_each_analog_state(int jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6, int jarg7, int jarg8);
  public final static native void set_analog_pullup(int jarg1, int jarg2);
  public final static native void disable_servos();
  public final static native void enable_servos();
  public final static native int get_servo_position(int jarg1);
  public final static native void set_servo_position(int jarg1, int jarg2);
  public final static native void disable_servo(int jarg1);
  public final static native void enable_servo(int jarg1);
  public final static native int get_servo_enabled(int jarg1);
  public final static native void set_servo_enabled(int jarg1, int jarg2);
  public final static native void msleep(int jarg1);
  public final static native double seconds();
  public final static native void camera_close();
  public final static native int camera_load_config(String jarg1);
  public final static native int camera_open(int jarg1);
  public final static native int camera_update();
  public final static native int get_channel_count();
  public final static native int get_code_num(int jarg1, int jarg2);
  public final static native int get_object_area(int jarg1, int jarg2);
  public final static native double get_object_confidence(int jarg1, int jarg2);
  public final static native int get_object_count(int jarg1);
  public final static native String get_object_data(int jarg1, int jarg2);
  public final static native int get_object_data_length(int jarg1, int jarg2);
}