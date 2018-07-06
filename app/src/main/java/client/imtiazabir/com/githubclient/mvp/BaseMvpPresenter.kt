package client.imtiazabir.com.githubclient.mvp


interface BaseMvpPresenter<in V : BaseMvpView> {

    fun attachView(view: V)

    fun detachView()
}