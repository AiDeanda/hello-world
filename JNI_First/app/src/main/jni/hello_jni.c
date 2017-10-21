#include <com_example_xinjianchi_jni_first_HelloWorld.h>
//返回一个字符串
JNIEXPORT jstring JNICALL Java_com_example_xinjianchi_jni_1first_HelloWorld_helloWorld
  (JNIEnv *env, jclass jobj) {
    return (*env)->NewStringUTF(env,"HelloWorld 我是用jni调用出来的字符串");
}
//返回 a+b的结果
JNIEXPORT jint JNICALL Java_com_example_xinjianchi_jni_1first_HelloWorld_add
  (JNIEnv *env, jclass jobj, jint a, jint b){
  return a+b;
}