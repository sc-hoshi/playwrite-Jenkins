import { test, expect } from '@playwright/test';

test('test', async ({ page }) => {
    await page.goto('https://www.yahoo.co.jp/');
    await page.getByRole('searchbox', { name: '検索したいキーワードを入力してください' }).fill('Playwright');
    await page.getByRole('button', { name: '検索' }).click();
    await page.screenshot({ path: 'screenshot.png', fullPage: true });
});