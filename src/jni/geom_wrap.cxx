/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 * 
 * This file is not intended to be easily readable and contains a number of 
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG 
 * interface file instead. 
 * ----------------------------------------------------------------------------- */

#define SWIGJAVA


#ifdef __cplusplus
/* SwigValueWrapper is described in swig.swg */
template<typename T> class SwigValueWrapper {
  struct SwigMovePointer {
    T *ptr;
    SwigMovePointer(T *p) : ptr(p) { }
    ~SwigMovePointer() { delete ptr; }
    SwigMovePointer& operator=(SwigMovePointer& rhs) { T* oldptr = ptr; ptr = 0; delete oldptr; ptr = rhs.ptr; rhs.ptr = 0; return *this; }
  } pointer;
  SwigValueWrapper& operator=(const SwigValueWrapper<T>& rhs);
  SwigValueWrapper(const SwigValueWrapper<T>& rhs);
public:
  SwigValueWrapper() : pointer(0) { }
  SwigValueWrapper& operator=(const T& t) { SwigMovePointer tmp(new T(t)); pointer = tmp; return *this; }
  operator T&() const { return *pointer.ptr; }
  T *operator&() { return pointer.ptr; }
};

template <typename T> T SwigValueInit() {
  return T();
}
#endif

/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__)) 
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__)) 
# else
#   define SWIGUNUSED 
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif 
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED 
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#  ifndef GCC_HASCLASSVISIBILITY
#    define GCC_HASCLASSVISIBILITY
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif 
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif



/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1, 
  SWIG_JavaIOException, 
  SWIG_JavaRuntimeException, 
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  jenv->ExceptionClear();
  excep = jenv->FindClass(except_ptr->java_exception);
  if (excep)
    jenv->ThrowNew(excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


    #include "include/kovan/geom.h"
    #include "include/kovan/geom.hpp"


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_point2_1x_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  point2 *arg1 = (point2 *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(point2 **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->x = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_point2_1x_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  point2 *arg1 = (point2 *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(point2 **)&jarg1; 
  result = (int) ((arg1)->x);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_point2_1y_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  point2 *arg1 = (point2 *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(point2 **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->y = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_point2_1y_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  point2 *arg1 = (point2 *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(point2 **)&jarg1; 
  result = (int) ((arg1)->y);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_new_1point2(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  point2 *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (point2 *)new point2();
  *(point2 **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_delete_1point2(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  point2 *arg1 = (point2 *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(point2 **)&jarg1; 
  delete arg1;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1ulx_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  rectangle *arg1 = (rectangle *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->ulx = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1ulx_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  rectangle *arg1 = (rectangle *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  result = (int) ((arg1)->ulx);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1uly_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  rectangle *arg1 = (rectangle *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->uly = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1uly_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  rectangle *arg1 = (rectangle *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  result = (int) ((arg1)->uly);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1width_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  rectangle *arg1 = (rectangle *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->width = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1width_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  rectangle *arg1 = (rectangle *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  result = (int) ((arg1)->width);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1height_1set(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jint jarg2) {
  rectangle *arg1 = (rectangle *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  arg2 = (int)jarg2; 
  if (arg1) (arg1)->height = arg2;
}


SWIGEXPORT jint JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_rectangle_1height_1get(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jint jresult = 0 ;
  rectangle *arg1 = (rectangle *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(rectangle **)&jarg1; 
  result = (int) ((arg1)->height);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_new_1rectangle(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  rectangle *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (rectangle *)new rectangle();
  *(rectangle **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_delete_1rectangle(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  rectangle *arg1 = (rectangle *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(rectangle **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_new_1unsignedIntPoint2(JNIEnv *jenv, jclass jcls, jlong jarg1, jlong jarg2) {
  jlong jresult = 0 ;
  unsigned int *arg1 = 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp1 ;
  unsigned int temp2 ;
  Point2< unsigned int > *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  temp1 = (unsigned int)jarg1; 
  arg1 = &temp1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  result = (Point2< unsigned int > *)new Point2< unsigned int >((unsigned int const &)*arg1,(unsigned int const &)*arg2);
  *(Point2< unsigned int > **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntPoint2_1x(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Point2< unsigned int > const *)arg1)->x();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntPoint2_1y(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Point2< unsigned int > const *)arg1)->y();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntPoint2_1setX(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setX((unsigned int const &)*arg2);
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntPoint2_1setY(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setY((unsigned int const &)*arg2);
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntPoint2_1toCPoint2(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  point2 result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  result = ((Point2< unsigned int > const *)arg1)->toCPoint2();
  *(point2 **)&jresult = new point2((const point2 &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_delete_1unsignedIntPoint2(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  Point2< unsigned int > *arg1 = (Point2< unsigned int > *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(Point2< unsigned int > **)&jarg1; 
  delete arg1;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_new_1unsignedIntRect2(JNIEnv *jenv, jclass jcls, jlong jarg1, jlong jarg2, jlong jarg3, jlong jarg4) {
  jlong jresult = 0 ;
  unsigned int *arg1 = 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int *arg3 = 0 ;
  unsigned int *arg4 = 0 ;
  unsigned int temp1 ;
  unsigned int temp2 ;
  unsigned int temp3 ;
  unsigned int temp4 ;
  Rect< unsigned int > *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  temp1 = (unsigned int)jarg1; 
  arg1 = &temp1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  temp3 = (unsigned int)jarg3; 
  arg3 = &temp3; 
  temp4 = (unsigned int)jarg4; 
  arg4 = &temp4; 
  result = (Rect< unsigned int > *)new Rect< unsigned int >((unsigned int const &)*arg1,(unsigned int const &)*arg2,(unsigned int const &)*arg3,(unsigned int const &)*arg4);
  *(Rect< unsigned int > **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1x(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Rect< unsigned int > const *)arg1)->x();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1y(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Rect< unsigned int > const *)arg1)->y();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1width(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Rect< unsigned int > const *)arg1)->width();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1height(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = (unsigned int *) &((Rect< unsigned int > const *)arg1)->height();
  jresult = (jlong)*result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1center(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  SwigValueWrapper< Point2< unsigned int > > result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = ((Rect< unsigned int > const *)arg1)->center();
  *(Point2< unsigned int > **)&jresult = new Point2< unsigned int >((const Point2< unsigned int > &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1setX(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setX((unsigned int const &)*arg2);
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1setY(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setY((unsigned int const &)*arg2);
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1setWidth(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setWidth((unsigned int const &)*arg2);
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1setHeight(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_, jlong jarg2) {
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int *arg2 = 0 ;
  unsigned int temp2 ;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  temp2 = (unsigned int)jarg2; 
  arg2 = &temp2; 
  (arg1)->setHeight((unsigned int const &)*arg2);
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1area(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  unsigned int result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = (unsigned int)((Rect< unsigned int > const *)arg1)->area();
  jresult = (jlong)result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_unsignedIntRect2_1toCRectangle(JNIEnv *jenv, jclass jcls, jlong jarg1, jobject jarg1_) {
  jlong jresult = 0 ;
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  rectangle result;
  
  (void)jenv;
  (void)jcls;
  (void)jarg1_;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  result = ((Rect< unsigned int > const *)arg1)->toCRectangle();
  *(rectangle **)&jresult = new rectangle((const rectangle &)result); 
  return jresult;
}


SWIGEXPORT void JNICALL Java_linkjvm_low_geom_linkjvm_1geomJNI_delete_1unsignedIntRect2(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  Rect< unsigned int > *arg1 = (Rect< unsigned int > *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(Rect< unsigned int > **)&jarg1; 
  delete arg1;
}


#ifdef __cplusplus
}
#endif

