package com.java.设计模式.$创建者模式;

import org.springframework.util.StringUtils;

/**
 * @ClassName:Human
 * @Description:建造者模式
 * @Author: guoyong
 * @Date:2020/5/9 17:44
 **/
public class Human {
    private String name;
    private String age;

    public Human(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    private static class Builder{
        private String name;
        private String age;

      public Human build(){
          if (StringUtils.endsWithIgnoreCase("111",name)){
              throw new IllegalMonitorStateException();
          }
          return new Human(this);
      }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }
    }

}
