import { StringInterpolationPage } from './app.po';

describe('string-interpolation App', () => {
  let page: StringInterpolationPage;

  beforeEach(() => {
    page = new StringInterpolationPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
