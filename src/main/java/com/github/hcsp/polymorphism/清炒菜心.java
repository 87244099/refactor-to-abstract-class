package com.github.hcsp.polymorphism;

public class 清炒菜心 extends 菜{
    public void 做个清炒菜心() {
        super.做一个菜();
    }

    @Override
    public void 洗锅() {
        System.out.println("洗炒锅");
    }

    @Override
    public void 倒油() {
        System.out.println("倒一点点油");
    }

    @Override
    public void 放佐料() {
        System.out.println("放酱油");
        System.out.println("放盐");
    }

    @Override
    public void 开始烹饪() {
        System.out.println("放青菜");
        System.out.println("炒啊炒啊炒");
    }

    @Override
    public void 出锅() {
        System.out.println("香喷喷的清炒菜心出锅啦");
    }
}
