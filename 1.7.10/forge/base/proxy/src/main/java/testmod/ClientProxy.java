package testmod;

public class ClientProxy extends CommonProxy {//Клиентские действия: регистрация рендеров, загрузка моделей
    
    public void preInit(FMLPreInitializationEvent event) {
        super.preInit(event);//Мы расширили клиенское прокси от общего и теперь нужно выполнить на клиенте общий функционал
        
    }

    
    public void init(FMLInitializationEvent event) {
        super.init(event);

    }

    
    public void postInit(FMLPostInitializationEvent event) {
        super.postInit(event);
        
    }
}