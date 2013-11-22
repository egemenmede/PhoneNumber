PhoneNumber (PhoneGap Plugin)
=================================

"PhoneNumber", ANDROID'li cihazlar için PhoneGap 2.2.0=<3.0.0 sürümlerinde kullanabileceğiniz bir PhoneGap Pluginidir. 

Çalıştırıldığında bilgi olarak cep telefonunuzun numarasını döndürür. 

Eğer GSM hattı kullanmayan bir cihazda çalıştırırsanız geriye "null" değeri döndürür.

PLUGIN KURULUMU
=================================

1. phonenumber.js dosyasını HTML sayfasının içerisine ekleyin.

<pre>
<code>
<script type="text/javascript" charset="utf-8" src="phonenumber.js"></script>
</code>
</pre>

2. PhoneNumber.java dosyasını src klasöründe olduğu gibi com.dp.plugin.phonenumber packageinin altına ekleyin.

3. res>xml>config.xml dosyasına plugini aşağıdaki gibi tanımlayın.

<pre>
<code>
<feature name="PhoneNumber">
    <param name="android-package" value="com.dp.plugin.phonenumber.PhoneNumber" />
</feature>
</code>
</pre>

4. "AndoridManifest.xml" dosyasına alağıdaki gibi READ_PHONE_STATE izni vermeyi unutmayın.

<pre>
<code>
<uses-permission android:name="android.permission.READ_PHONE_STATE" />
</code>
</pre>

Sorularınız için;

http://www.delipenguen.com
