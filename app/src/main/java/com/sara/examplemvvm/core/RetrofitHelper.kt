package com.sara.examplemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}

/* FATAL EXCEPTION: main
                                                                                                    Process: com.sara.examplemvvm, PID: 23770
                                                                                                    javax.net.ssl.SSLHandshakeException: java.security.cert.CertPathValidatorException: Trust anchor for certification path not found.
                                                                                                    	at com.android.org.conscrypt.ConscryptFileDescriptorSocket.startHandshake(ConscryptFileDescriptorSocket.java:229)
                                                                                                    	at okhttp3.internal.connection.RealConnection.connectTls(RealConnection.java:336)
                                                                                                    	at okhttp3.internal.connection.RealConnection.establishProtocol(RealConnection.java:300)
                                                                                                    	at okhttp3.internal.connection.RealConnection.connect(RealConnection.java:185)
                                                                                                    	at okhttp3.internal.connection.ExchangeFinder.findConnection(ExchangeFinder.java:224)
                                                                                                    	at okhttp3.internal.connection.ExchangeFinder.findHealthyConnection(ExchangeFinder.java:108)
                                                                                                    	at okhttp3.internal.connection.ExchangeFinder.find(ExchangeFinder.java:88)
                                                                                                    	at okhttp3.internal.connection.Transmitter.newExchange(Transmitter.java:169)
                                                                                                    	at okhttp3.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:41)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
                                                                                                    	at okhttp3.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:94)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
                                                                                                    	at okhttp3.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
                                                                                                    	at okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:88)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:142)
                                                                                                    	at okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:117)
                                                                                                    	at okhttp3.RealCall.getResponseWithInterceptorChain(RealCall.java:229)
                                                                                                    	at okhttp3.RealCall$AsyncCall.execute(RealCall.java:172)
                                                                                                    	at okhttp3.internal.NamedRunnable.run(NamedRunnable.java:32)
                                                                                                    	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
                                                                                                    	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
                                                                                                    	at java.lang.Thread.run(Thread.java:764)
                                                                                                    	Suppressed: kotlinx.coroutines.DiagnosticCoroutineContextException: [StandaloneCoroutine{Cancelling}@fb14647, Dispatchers.Main.immediate]
                                                                                                    Caused by: java.security.cert.CertificateException: java.security.cert.CertPathValidatorException: Trust anchor for certification path not found.
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.verifyChain(TrustManagerImpl.java:661)
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.checkTrustedRecursive(TrustManagerImpl.java:539)
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.checkTrustedRecursive(TrustManagerImpl.java:605)
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.checkTrusted(TrustManagerImpl.java:495)
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.checkTrusted(TrustManagerImpl.java:418)
                                                                                                    	at com.android.org.conscrypt.TrustManagerImpl.getTrustedChainForServer(TrustManagerImpl.java:339)
                                                                                                    	at android.security.net.config.NetworkSecurityTrustManager.checkServerTrusted(NetworkSecurityTrustManager.java:94)
                                                                                                    	at android.security.net.config.RootTrustManager.checkServerTrusted(RootTrustManager.java:88)
                                                                                                    	at com.android.org.conscrypt.Platform.checkServerTrusted(Platform.java:208)
                                                                                                    	at com.android.org.conscrypt.ConscryptFileDescriptorSocket.verifyCertificateChain(ConscryptFileDescriptorSocket.java:404)
                                                                                                    	at com.android.org.conscrypt.NativeCrypto.SSL_do_handshake(Native Method)
                                                                                                    	at com.android.org.conscrypt.NativeSsl.doHandshake(NativeSsl.java:375)
                                                                                                    	at com.android.org.conscrypt.ConscryptFileDescriptorSocket.startHandshake(ConscryptFileDescriptorSocket.java:224)
                                                                                                    	... 24 more
                                                                                                    Caused by: java.security.cert.CertPathValidatorException: Trust anchor for certification path not found.
                                                                                                    	... 37 more
2023-04-20 12:02:46.601 23770-23770 Process                 com.sara.examplemvvm                 I  Sending signal. PID: 23770 SIG: 9
---------------------------- PROCESS ENDED (23770) for package com.sara.examplemvvm ----------------------------
2023-04-20 12:02:46.698  1940-2015  InputDispatcher         system_server                        E  channel '4225ac8 com.sara.examplemvvm/com.sara.examplemvvm.ui.view.MainActivity (server)' ~ Channel is unrecoverably broken and will be disposed!*/