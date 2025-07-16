// @PropertySource annotation dùng để khai báo file config. Nếu không có annotation này, Spring sẽ sử dụng file mặc định (application.properties trong resource)
@PropertySource("classpath:config.properties")
@PropertySources({ 
        @PropertySource("classpath:config1.properties"), 
        @PropertySource("classpath:config2.properties")
    })

@Value("${app.name}")
