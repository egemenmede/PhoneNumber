PhoneNumber (PhoneGap Plugin)
===========

"PhoneNumber", ANDROID'li cihazlar için PhoneGap 2.2.0=<3.0.0 sürümlerinde kullanabileceğiniz bir PhoneGap Plugin'idir. 

Çalıştırıldığında bilgi olarak cep telefonunuzun numarasını döndürür. 

Eğer GSM hattı kullanmayan bir cihazda çalıştırırsanız geriye "null" değeri döndürür.

PLUGIN KURULUMU
===========

1. "phonenumber.js" dosyasını HTML sayfasının içerisine ekleyin.

<script type="text/javascript" charset="utf-8" src="phonenumber.js"></script>

2. "PhoneNumber.java" dosyasını "src" klasöründe olduğu gibi "com.dp.plugin.phonenumber" package'inin altına ekleyin.

3. res>xml>config.xml dosyasına plugin'i aşağıdaki gibi tanımlayın.

<feature name="PhoneNumber">
    <param name="android-package" value="com.dp.plugin.phonenumber.PhoneNumber" />
</feature>

4. "AndoridManifest.xml" dosyasına alağıdaki gibi "READ_PHONE_STATE" izni vermeyi unutmayın.

<uses-permission android:name="android.permission.READ_PHONE_STATE" />

Sorularınız için;

http://www.delipenguen.com
